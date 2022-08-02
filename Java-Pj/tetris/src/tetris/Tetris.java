package tetris;


import java.applet‎.*;
import java.awt.*;
import java.util.*;

public class Tetris extends Applet‎ implements Runnable {

  /* */
  /* 상태정보,대개 mutex로 보호됨*/
  /* 이들값중일부는 .init이나 .erase 메서드 실행중에 대체된다 */
  /* */

  int edge = 16;		/* 블록의 변의 픽셀 수 */
  int width = 10;		/*  불록 단위의 너비*/
  int height = 20;		/*블록 단위의 높이*/
  int textSquares = 2;		/*점수에 사용되는 추가 네모 높이 */

  int shapes = 8;		/* 빈것을 포함한 도형 수 */
  int empty = 0;		/* 빈 네모의 도혐 번호*/
  Color[] colors = null;	/*각 도형의 색*/

  int[][] occupant = null;	/*각네모의 도형 번호*/
  boolean[][] piece = null;	/* 현재 조각의 도형*/
  int kind = 0;			/* 현재 조각의 도혐 번호 */
  int pieceSize = 4;		/*회전을 위한 현재 조각의 너비와 높이 */
  Point place = null;		/*최근에 조각의 왼쪽 위 좌표*/
  int value = 0;		/* 현재 조각의 현재 점수 값 */
  boolean moved;		/* 최근에 조각을 이동했는가? */

  int score = 0;		/* 현재 게임의 점수 */
  int maxLevel = 10;		/*선택할 수 있는 최고 단계 */
  int[] high = null;		/* 이번회의 최고 점수 */
  int level = 5;		/*현재 단계 */
  int fallCount = 0;		/* 마지막 단계 변경 후위 블록수 */
  int fallEnough = 200;		/* fallCount를 바탕으로 한 단계 증가의 임계값 */
  
  /* 모든시간 계산의 단위는 밀리초임 */
  boolean paused = false;	/*아무것도 변하지 않음  */
  boolean animate = true;	/* 아래로 이동의 부드러운 애니메이션 */
  int sleepTime = 33;		/*daemon 작동간격 */
  int moveTime;			/*이동간격  */
  long movieEnd;		/* "drop"무비가 끝난 실제 시간 */

  Thread daemon = null;		/* 블록 이동 스레드 */
  Image offscreen = null;	/* 화몀 밖 게임판,깜박이지 안게 하기 위해 */
  Image images[] = null;	/* 네모의 화면 밖 이미지 ,빠른 표시를 위해 */
  boolean boardInvalid = true;	/* 화면 밖 이미지가 데이터와 일치하지 않음 */
  Font theFont;			/* 점수위 글꼴 */
  
  
  /* */
  /* Game play */
  /* */
  
  private synchronized void erase(int levelDelta) { /* 새게임 시작,묵시적 초기화 포함 */
    if (colors==null) {
      colors = new Color[shapes];
      colors[empty] = new Color(102,102,102);	/* 어두운 회색 */
      colors[1]     = new Color(153,51,51);	/* 적색 */
      colors[2]     = new Color(204,204,0);	/* 황색 */
      colors[3]     = new Color(51,153,51);	/* 녹색 */
      colors[4]     = new Color(0,204,204);	/* 하늘색 */
      colors[5]     = new Color(51,102,204);	/* 청색 */
      colors[6]     = new Color(153,0,153);	/*선홍색 */
      colors[7]     = new Color(204,102,51);	/*주황색 */
    }
    if (high==null) {
      high = new int[maxLevel+1];
      for (int i=0; i<=maxLevel; i++) high[i] = 0;
    }
    if (occupant==null) occupant = new int[width][height];
    
    /* 이전 게임의 결과를 처리*/
    high[level] = Math.max(high[level], score);
    level = Math.max(0, Math.min(maxLevel, level+levelDelta));
    
    /* 이게 게임판을 지우고 빈 게임판을 다시 표시 */
    for (int x = 0; x= 0) break;
    }
    if (found<0) return false;
    /* 완전한 행이 있음.위의 행을 내림 */
    for (int y=found; y>0; y--) {
      for (int x=0; x=0 && (
                 newX<0 || newX>=width || newY>=height ||
                 occupant[newX][newY] != empty ) ) {
          return false;
        }
      }
    }
    piece = newPiece;
    place = newPlace;
    moved = true;
    repaintPiece();
    return true;
  }
  
  private synchronized boolean newPiece() {
    /* 기존의 조각을 배치된 것으로 변환하고 새 조각을 만든다.새 조각이 타당하면 ture를 반환한다. */
    if (piece != null) {
      for (int x=0; x= 0) occupant[place.x+x][place.y+y] = kind;
        }
      }
      score += value;
    }
    
    while (clearRow()) { }
    
    if (fallCount >= fallEnough) {
      high[level] = Math.max(high[level], score); /* 이동중 ,높은 점수를 기록 */
      level = Math.min(maxLevel, level+1);
      fallCount -= fallEnough;
    }
    moveTime = Math.max(100, 600-level*50);
    
    paintScore();
    repaint();
    boolean[][] newPiece = initPiece();
    kind = (short)(Math.floor(Math.random()*(shapes-1)+1));
    value = 24 + 2*level;
    int initX = 0;
    switch (kind) { /*****블럭의 형태 구현. ^^****/
    case 1:                    
      newPiece[0][1] = true;	/* . . . . */
      newPiece[1][1] = true;	/* X X X X */
      newPiece[2][1] = true;	/* . . . . */
      newPiece[3][1] = true;	/* . . . . */
      initX = -1;
      pieceSize = 4;
      break;
    case 2:
      newPiece[0][1] = true;	/* . . . . */
      newPiece[1][1] = true;	/* X X X . */
      newPiece[1][2] = true;	/* . X . . */
      newPiece[2][1] = true;	/* . . . . */
      initX = -1;
      pieceSize = 3;
      break;
    case 3:
      newPiece[0][2] = true;	/* . . . . */
      newPiece[1][1] = true;	/* . X X . */
      newPiece[1][2] = true;	/* X X . . */
      newPiece[2][1] = true;	/* . . . . */
      initX = -2;
      pieceSize = 3;
      break;
    case 4:
      newPiece[0][1] = true;	/* . . . . */
      newPiece[1][1] = true;	/* X X . . */
      newPiece[1][2] = true;	/* . X X . */
      newPiece[2][2] = true;	/* . . . . */
      initX = -2;
      pieceSize = 3;
      break;
    case 5:
      newPiece[0][1] = true;	/* . . . . */
      newPiece[0][2] = true;	/* X X X . */
      newPiece[1][1] = true;	/* X . . . */
      newPiece[2][1] = true;	/* . . . . */
      initX = -1;
      pieceSize = 3;
      break;
    case 6:
      newPiece[0][1] = true;	/* . . . . */
      newPiece[1][1] = true;	/* X X X . */
      newPiece[2][1] = true;	/* . . X . */
      newPiece[2][2] = true;	/* . . . . */
      initX = -1;
      pieceSize = 3;
      break;
    case 7:
      newPiece[0][0] = true;	/* X X . . */
      newPiece[0][1] = true;	/* X X . . */
      newPiece[1][0] = true;	/* . . . . */
      newPiece[1][1] = true;	/* . . . . */
      initX = -1;
      pieceSize = 2;
      break;
    default:
      System.err.println("unexpected shape kind "+kind);
      return false;
    }
    return putPiece(newPiece, new Point((width-pieceSize)/2, initX));
  }

  private boolean movePiece(int dx, int dy) {
    /* 타당하면 조각을 어떤 방향으로든 네모 하나 너비만큼 이동 */
    if (piece==null) return false;
    return putPiece(piece, new Point(place.x+dx, place.y+dy));
  }
  
  private boolean rotatePiece() {
    /* 타탕하면 조각을 반시계 방향으로 회전 */
    if (piece==null) return false;
    boolean[][] newPiece = initPiece();
    for (int x=0; x= nextMove && !paused) {
          nextMove = Math.max(now, nextMove+moveTime);
          long newMovieEnd = animate ? nextMove : now;
          if (moved) {
            /* 아직 자동으로 또는 사용자가 조각을 움직여 진행 중.한번 더 아래로 이동해 볼것*/
            moved = false;
            movieEnd = newMovieEnd;
            if (movePiece(0,1)) {
              value = Math.max(0, value-1);
              fallCount+=1;
            } else {
              /* 아직 이전 조각을 표시 중.무비를 종료하고 조각을 마지막 장소에 표시*/
              movieEnd = now;
              repaintPiece();
            };
          } else {
            /* 마지막 자동 이동으로 아무 일도 일어나지 않았는데 사용자가 아무 행동도 하지 않음.
            다른 조각을 생성하고 실패하면 게임을 종료*/
            movieEnd = now;
            repaintPiece();
            movieEnd = newMovieEnd;
            if (!newPiece()) erase(0);
          }
        } else {
          repaintPiece();
        }
      }
      try { Thread.sleep(sleepTime);
      } catch (InterruptedException e) { };
    };
  }


  /* */
  /* 그리기 */
  /* */
  
  /* 일반적인 "offscreen"에 표시하여 깜박임을 방지한 다음 그것의 적절한 부분집합을 화면 에
     표시하는 것이다.대부분의 표시 작동은 "repaintPiece"호출을 통해 동기화되는데,그 이유는
     그것이 화면에 복사하는 네모 수를 줄이는 방법이기 때문이다.대안으로느 "repaintPiece"의
     "repaint"가 있지만 그것은 속도가 느리고 실행 시간 시스템이 "update"를 호출할 경우 
     타이밍이 달라질 수 있다.또한 가 네모 새긩 픽셀을 저장하는 "images"라는 화면 밖 이미지가
     있는데,이것은 필요할때 네모를 생성하는 것보다 좀더 빠르며 네모의 이미지에 GIF와 같은 
     형식을 사용할 경우 적합한 방법이기도 하다*/
     
  private void paintSquare(Graphics g, int x, int y, int delta, int shape) {
    /* "images"에서 한 픽셀을 사실상 화면 밖 이미지에 표시 */
    g.drawImage(images[shape], x*edge, (y+textSquares)*edge+delta, this);
  }

  private void paintScore() {
    /* score나 pause상태가 바뀌었으므로 화면 밖 이미지를 새로 고침 */
    if (offscreen == null) return;
    Graphics g = offscreen.getGraphics();
    int margin = 1+edge/8;
    g.setColor(colors[empty]);
    g.fill3DRect(0, 0, width*edge, textSquares*edge, true);
    g.setFont(theFont);
    FontMetrics fm = this.getFontMetrics(theFont);
    int fontHeight = fm.getHeight();
    int fontAscent = fm.getAscent();
    int leading = (textSquares*edge-2*fontHeight)/3;
    String left = "Best: "+high[level];
    String right = paused ? "Paused" : "";
    String left2 = "Current: "+score;
    String right2 = "Level: "+level;
    int baseline = leading + fontAscent;
    g.setColor(Color.white);
    g.drawString(left, margin, baseline);
    g.setColor(Color.red);
    g.drawString(right, width*edge-margin-fm.stringWidth(right), baseline);
    g.setColor(Color.white);
    baseline += fontHeight+leading;
    g.drawString(left2, margin, baseline);
    g.drawString(right2, width*edge-margin-fm.stringWidth(right2), baseline);
  }

  private void paintPiece(boolean doRepaint) {
    /* 조각이 바뀌거나 이동했으므로 화면 밖 이미지를 새로 고친다.조각을 표시하고 최근의
	  네모 하나 이동과 이전의 진행 중 이동을 처리한다."doRepaint"인 경우네는 대상 네모들을 
  	동기화하여 화면에 표시한다 */
    long now = System.currentTimeMillis();
    int moviePos = -(int)((Math.max(movieEnd-now,0)*edge+moveTime/2)/moveTime);
    if (piece == null || offscreen == null ) return;
    int minX = Math.max(place.x-1, 0);
    int limX = Math.min(place.x+pieceSize+1, width);
    int minY = Math.max(place.y-2, 0);
    int limY = Math.min(place.y+pieceSize, height); /*조각이 이동하지 않았음! */
    {
      Graphics g = offscreen.getGraphics();
      g.clipRect(0, textSquares*edge, width*edge, height*edge);
      for (int x = minX; x= place.x && x < place.x+pieceSize &&
               y >= place.y && y < place.y+pieceSize &&
               piece[x-place.x][y-place.y] )  {
            paintSquare(g, x, y, moviePos, kind);
          }
        }
      }
    }
    if (doRepaint) {
      Graphics g = getGraphics();
      g.clipRect(minX*edge, (minY+textSquares)*edge,
                 (limX-minX)*edge, (limY-minY)*edge);
      g.drawImage(offscreen, 0, 0, this);
    }
  }
  
  private void repaintPiece() {
    /* 화면 밖 이미지를 현재 사애의 조각으로 갱신하고 픽셀이 화면에 제대로 표시되는지 확인. */
    paintPiece(!boardInvalid);
  }
  
  private void paintBoard() {
    /* 화면 밖 이미지를 백지 상태에서 생성 */
    Graphics g = offscreen.getGraphics();
    g.clipRect(0, textSquares*edge, width*edge, height*edge);
    for (int x = 0; x 0) erase(-1);
      return true;
    case 'j':
    case Event.LEFT:
      movePiece(-1,0);
      return true;
    case 'k':
    case Event.UP:
      rotatePiece();
      return true;
    case 'l':
    case Event.RIGHT:
      movePiece(1,0);
      return true;
    case 'p':
      paused = !paused;
      paintScore();
      repaint();
      return true;
    case 's':
      erase(0);
      return true;
    case 'u':
      if (level < maxLevel) erase(+1);
      return true;
    case ' ':
    case Event.DOWN:
      movieEnd = System.currentTimeMillis();
      while (movePiece(0,1)) {}
      return true;
   }
    return false;
  }

}                 


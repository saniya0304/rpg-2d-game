package mainrpg;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;



public class GamePanelRPG extends JPanel implements Runnable{
	
         // SCREEN SETTINGS
	     final int originalTileSize = 16; //16x16 tile
         final int scale =  3;	 
         
         final int tileSize = originalTileSize * scale; //48x48 tile
         final int maxScreenCol = 16;
         final int maxScreenRow = 12;
         final int screenWidth = tileSize * maxScreenCol; // 768 pixels
         final int screenHeight = tileSize * maxScreenRow; //576 pixels
         
         Thread gameThread;
         
         public void GamePanelRPG() {
        	 
        	 this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        	 this.setBackground(Color.black);
        	 this.setDoubleBuffered(true);
         }

         public void startGameThread() {
        	 gameThread = new Thread(this);
        	 gameThread.start();
         }
		
         @Override
		public void run() {
			
        	 
        	 
		}
}

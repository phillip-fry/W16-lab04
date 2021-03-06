package edu.ucsb.cs56.w16.drawings.andrewberls.advanced;

import javax.swing.JFrame;

/** A viewer class to see pictures drawn by Andrew Berls
 *
 * @author P. Conrad
 * @author Andrew Berls
 * @version for UCSB CS56 W14
 */

public class MultiPictureViewer
{
   public static void main(String[] args)
   {
       int whichPicture = 1;

       // If user passed a command line argument,
       // get which picture we want to display from the user

       if (args.length== 1) {
	   whichPicture = Integer.parseInt(args[0]);
       }

       JFrame frame = new JFrame();

       // Set the size to whatever size you like (width, height)
       // For projects you turn in, lets not get any bigger than 640,480

       frame.setSize(640,480);

       // Set your own title
       frame.setTitle("Andrew's Drawing #" + whichPicture);

       // Always do this so that the red X (or red circle) works
       // to close the window.

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Instantiate your drawing as a "component"

       MultiPictureComponent component =
	   new MultiPictureComponent(whichPicture);

      // Always add your component to the frame
      // and then make the window visible

      frame.add(component);
      frame.setVisible(true);
   }
}

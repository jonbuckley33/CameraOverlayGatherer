/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartdashboard.extensions;

import edu.wpi.first.smartdashboard.camera.WPICameraExtension;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jon Buckley
 */
public class CameraOverlayGatherer extends CameraOverlay
{
    public CameraOverlayGatherer()
    {
        super();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintParent(g);
        
        if (yCoordField.getText().compareTo("")!=0)
            yCoord =  Integer.parseInt(yCoordField.getText());
        
        g.setColor(Color.blue);
        g.fillRect(0, yCoord, 300, 2);
    }
}

import javax.swing.JFrame;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class BasicFrame implements GLEventListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		final GLCanvas glcanvas = new GLCanvas(capabilities);

		BasicFrame basicframe = new BasicFrame();
		glcanvas.addGLEventListener(basicframe);
		
		glcanvas.setSize(400, 400);
		
		final JFrame frame = new JFrame("Basic Frame");
		
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		
		frame.setVisible(true);
	}

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
		final GL2 gl = drawable.getGL().getGL2();
		
		gl.glBegin(GL.GL_LINES);
		
			gl.glVertex2f(0.5f, 0.5f);
			gl.glVertex2f(0.5f, -0.5f);
			
		
		gl.glEnd();
	}

	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}
	
	

}

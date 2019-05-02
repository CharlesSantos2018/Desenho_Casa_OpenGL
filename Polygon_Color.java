import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;


public class Polygon_Color implements GLEventListener {

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

		final GL2 gl = drawable.getGL().getGL2();
		// Complete o código para aplicar cor ao polígono
		// ...
		//
		gl.glBegin( GL2.GL_POLYGON );
		
		gl.glColor3f( 1.0f, 0.0f, 0.0f );
		gl.glVertex3f( 0f,0.5f,0f );
		gl.glColor3f(1.0f, 1.0f, 1.0f);
		gl.glVertex3f( -0.5f,0.2f,0f );
		gl.glColor3f( 1.0f, 0.0f, 0.0f );
		gl.glVertex3f( -0.5f,-0.2f,0f );
		gl.glColor3f(1.0f, 1.0f, 1.0f);
		gl.glVertex3f( 0f,-0.5f,0f );
		gl.glColor3f( 1.0f, 0.0f, 0.0f );
		gl.glVertex3f( 0f,0.5f,0f );
		gl.glColor3f(1.0f, 1.0f, 1.0f);
		gl.glVertex3f( 0.5f,0.2f,0f );
		gl.glColor3f( 1.0f, 0.0f, 0.0f );
		gl.glVertex3f( 0.5f,-0.2f,0f );
		gl.glColor3f(1.0f, 1.0f, 1.0f);
		gl.glVertex3f( 0f,-0.5f,0f );
		
		gl.glEnd();
	}

	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,
			int arg4) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		final GLCanvas glcanvas = new GLCanvas(capabilities);

		Polygon_Color basicframe = new Polygon_Color();
		glcanvas.addGLEventListener(basicframe);
		
		glcanvas.setSize(400, 400);
		
		final JFrame frame = new JFrame("Polygon_Color");
		
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		
		frame.setVisible(true);

	}

}

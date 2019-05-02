import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;


public class Triangule_Color implements GLEventListener {

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

		final GL2 gl = drawable.getGL().getGL2();
		gl.glBegin( GL2.GL_TRIANGLES );
		
		gl.glColor3f( 1.0f, 0.0f, 0.0f ); // Vermelho
		gl.glVertex3f( 0.5f,0.7f,0.0f ); // Topo
		gl.glColor3f( 0.0f,1.0f,0.0f ); // Verde
		gl.glVertex3f( -0.2f,-0.50f,0.0f ); // Base esquerda
		gl.glColor3f( 0.0f,0.0f,1.0f ); // Azul
		gl.glVertex3f( 0.5f,-0.5f,0.0f ); // Base direita
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

		Triangule_Color basicframe = new Triangule_Color();
		glcanvas.addGLEventListener(basicframe);
		
		glcanvas.setSize(400, 400);
		
		final JFrame frame = new JFrame("Triangule_Color");
		
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		
		frame.setVisible(true);

	}

}

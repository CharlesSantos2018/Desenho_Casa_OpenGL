import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class Quadrado implements GLEventListener {

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

		final GL2 gl = drawable.getGL().getGL2();
		
		// Desenha o lado esquerdo de cima
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(-0.5f, 0f);
		gl.glVertex2f(-0.5f, 0.5f);
		gl.glEnd();
		
		// Desenha o lado de cima esquerdo
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(-0.5f, 0.5f);
		gl.glVertex2f(0f, 0.5f);
		gl.glEnd();
		
		// Desenha o lado de cima direito
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0f, 0.5f);
		gl.glVertex2f(0.5f, 0.5f);
		gl.glEnd();
		
		// Desenha o lado direito de cima
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0.5f, 0.5f);
		gl.glVertex2f(0.5f, 0f);
		gl.glEnd();
		
		// Desenha o lado direito de baixo
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0.5f, 0f);
		gl.glVertex2f(0.5f, -0.5f);
		gl.glEnd();
		
		// Desenha o lado de baixo direito
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0.5f, -0.5f);
		gl.glVertex2f(0f, -0.5f);
		gl.glEnd();
		
		// Desenha o lado de baixo esquerdo
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0f, -0.5f);
		gl.glVertex2f(-0.5f, -0.5f);
		gl.glEnd();
		
		// Desenha o lado esquerdo de baixo
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(-0.5f, -0.5f);
		gl.glVertex2f(-0.5f, 0f);
		gl.glEnd();
	}

	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	public void reshape(GLAutoDrawable drawble, int x, int y, int width,
			int height) {
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
		Quadrilatero t = new Quadrilatero();
		glcanvas.addGLEventListener(t);
		glcanvas.setSize(400, 400);
		
		final JFrame frame = new JFrame ("Quadrilatero");
		
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);
		
		

	}
}

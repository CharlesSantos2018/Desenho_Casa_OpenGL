import javax.swing.JFrame;

//import com.jogamp.opengl.GL;
//import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.gl2.GLUT;


public class Casinha implements GLEventListener {

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

		final GL2 gl = drawable.getGL().getGL2();
		final GLUT glut = new GLUT();
		
		// DESENHANDO OS FUNDOS DO CÉU E GRAMADO
		
		gl.glBegin(GL2.GL_QUADS);//Fundo do céu
		
			gl.glColor3f(0.0f, 0.7f, 1.0f);
			gl.glVertex2f(1.0f, 1.0f);//canto superior direito
			gl.glColor3f(0.0f, 0.7f, 1.0f);
			gl.glVertex2f(-1.0f, 1.0f);//canto superior esquerdo
			gl.glColor3f(0.0f, 0.7f, 1.0f);
			gl.glVertex2f(-1.0f, -1.0f);//canto inferior esquerdo
			gl.glColor3f(0.0f, 0.7f, 1.0f);
			gl.glVertex2f(1.0f, -1.0f);//canto inferior direito
		
		gl.glEnd();

		
		gl.glBegin(GL2.GL_QUADS);//Fundo do gramado
		
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(1.0f, 0.1f);//canto superior direito
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(-1.0f, 0.1f);//canto superior esquerdo
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(-1.0f, -1.0f);//canto inferior esquerdo
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(1.0f, -1.0f);//canto inferior direito
		
		gl.glEnd();		
		
		// SOL
		gl.glPushMatrix();
			gl.glScalef(.5f, .7f, .5f);
			gl.glTranslatef(.6f, .4f, 0.0f);
			gl.glColor3f(1.0f, 1.0f, 0.0f);
			glut.glutSolidSphere(.2, 100, 100);
		gl.glPopMatrix();
		
		// DESENHANDO CASA
		
               /* Parte de cima da casa (Telhado) */
		
		gl.glTranslatef(-0.5f, -0.1f, 0.7f);
		
		gl.glScalef(0.7f, 0.7f, 0.0f);
		
		gl.glBegin(GL2.GL_TRIANGLES); // Telhado Esquerdo
		
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f( 0.0f, 0.3f); // Top
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f(-0.1f, 0.0f); // Base esquerda
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f( 0.1f, 0.0f); // Base direita
			
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);	// Telhado direito

			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f(0.0f, 0.3f); // Vert Top Esquerda
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f(0.1f, 0.0f); // Vert Base Esquerda
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f(0.5f, 0.0f); // Vert Base Direita
			gl.glColor3f( 0.7f, 0.3f, 0.1f);
			gl.glVertex2f(0.5f, 0.3f); // Vert Top Direita
		
		gl.glEnd();
		
               /* Parte de baixo da casa (Estrutura) */
		
		gl.glBegin(GL2.GL_QUADS); // Base Esquerda
		
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(-0.1f, 0.0f);// Top Esquerda
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.1f, 0.0f); // Top Direita
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.1f, -0.6f); // Base Direita
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(-0.1f, -0.6f); // Base Esquerda
		
		gl.glEnd();
		
		gl.glBegin(GL2.GL_QUADS); // Base Direita
		
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.1f , 0.0f);
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.1f , -0.6f);
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.5f , -0.6f);
			gl.glColor3f( 1.0f, 0.9f, 0.7f);
			gl.glVertex2f(0.5f , 0.0f);
		
		gl.glEnd();
		
		gl.glBegin(GL2.GL_QUADS); // Retangulo - porta casinha
		
			gl.glColor3f( 0.5f, 0.5f, 0.5f );
			gl.glVertex2f(0.1f, -0.25f); // Top direita
			gl.glColor3f( 0.5f, 0.5f, 0.5f );
			gl.glVertex2f(0.0f, -0.25f); // Top esquerda
			gl.glColor3f( 0.5f, 0.5f, 0.5f );
			gl.glVertex2f(0.0f, -0.6f); // Base esquerda
			gl.glColor3f( 0.5f, 0.5f, 0.5f );
			gl.glVertex2f(0.1f, -0.6f); // Base direita
		
		gl.glEnd();
		
		gl.glPushMatrix(); // Maçaneta da porta
			
			gl.glTranslatef(0.01f, -0.4f, 0.7f);
			gl.glScalef(0.1f, 0.1f, 0.1f);
			gl.glColor3f(0.0f, 0.0f, 0.0f);
			glut.glutSolidSphere(0.1, 100, 2);
			
		gl.glPopMatrix();
		
		// DETALHES DA CASA
		
        /* Parte de cima da casa (Telhado) */
	
	gl.glBegin(GL2.GL_LINES); // Telhado Esquerdo
	
		gl.glColor3f( 0.0f, 0.0f, 0.0f );
		gl.glVertex2f( 0.0f, 0.3f); // Aresta Esquerda - vertice topo
		gl.glVertex2f(-0.1f, 0.0f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(-0.1f, 0.0f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.1f, 0.0f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.1f, 0.0f); // Aresta Direita - vertice base direito
		gl.glVertex2f( 0.0f, 0.3f); // Aresta Direita - vertice topo
	
	gl.glEnd();

	gl.glBegin(GL2.GL_LINES);	// Telhado direito

		gl.glColor3f( 0.0f, 0.0f, 0.0f );
		gl.glVertex2f(0.0f, 0.3f); // Aresta Esquerda - vertice top esquerdo
		gl.glVertex2f(0.1f, 0.0f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(0.1f, 0.0f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.5f, 0.0f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.5f, 0.0f); // Aresta Direita - vertice base direito
		gl.glVertex2f(0.5f, 0.3f); // Aresta Direita - vertice topo direito
		gl.glVertex2f(0.5f, 0.3f); // Aresta Topo - vertice topo direito
		gl.glVertex2f(0.0f, 0.3f); // Aresta Topo - vertice topo esquerdo
	
	gl.glEnd();
	
	gl.glBegin(GL2.GL_LINES); // Grade do telhado
	
		gl.glColor3f(0.0f, 0.0f, 0.0f);
		gl.glVertex2f(0.05f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.15f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.10f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.20f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.15f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.25f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.20f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.30f, 0.0f); // Aresta Vertical 
		gl.glVertex2f(0.25f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.35f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.30f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.40f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.35f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.45f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.40f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.50f, 0.0f); // Aresta Vertical
		gl.glVertex2f(0.45f, 0.3f); // Aresta Vertical
		gl.glVertex2f(0.50f, 0.17f); // Aresta Vertical

		gl.glColor3f(0.14f, 0.14f, 0.14f);
		gl.glVertex2f(0.065f, 0.11f); // Aresta Horizontal
		gl.glVertex2f(0.50f, 0.11f); // Aresta Horizontal
		gl.glVertex2f(0.035f, 0.19f); // Aresta Horizontal
		gl.glVertex2f(0.50f, 0.19f); // Aresta Horizontal
		
		
	gl.glEnd();
	
        /* Parte de baixo da casa (Estrutura) */
	
	gl.glBegin(GL2.GL_LINES); // Base Esquerda
	
		gl.glColor3f( 0.0f, 0.0f, 0.0f );
		gl.glVertex2f(-0.1f, 0.0f);// Aresta Esquerda - vertice top esquerdo
		gl.glVertex2f(-0.1f, -0.6f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(-0.1f, -0.6f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.1f, -0.6f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.1f, -0.6f); // Aresta Direita - vertiec base direito
		gl.glVertex2f(0.1f, 0.0f); // Aresta Direita - vertice top direito
		gl.glVertex2f(0.1f, 0.0f); // Aresta Topo - vertice top direito
		gl.glVertex2f(-0.1f, 0.0f); // Aresta Topo - vertice top esquerdo
	
	gl.glEnd();
	
	gl.glBegin(GL2.GL_LINES); // Base Direita
	
		gl.glColor3f( 0.0f, 0.0f, 0.0f );
		gl.glVertex2f(0.1f , 0.0f); // Aresta Esquerda - vertice topo esquerdo
		gl.glVertex2f(0.1f , -0.6f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(0.1f , -0.6f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.5f, -0.6f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.5f , -0.6f); // Aresta Direita - vertice base direito
		gl.glVertex2f(0.5f, 0.0f); // Aresta Direita - vertice topo direito
		gl.glVertex2f(0.5f, 0.0f); // Aresta Topo - vertice topo direito
		gl.glVertex2f(0.01f, 0.0f); // Aresta Topo - vertice topo esquerdo
	
	gl.glEnd();
	
	gl.glBegin(GL2.GL_LINES); // Retangulo - porta casinha
	
		gl.glColor3f( 0.0f, 0.0f, 0.0f );
		gl.glVertex2f(0.0f, -0.25f); // Aresta Esquerda - vertice topo esquerdo
		gl.glVertex2f(0.0f, -0.6f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(0.0f, -0.6f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.1f, -0.6f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.1f, -0.6f); // Aresta Direita - vertice base direito
		gl.glVertex2f(0.1f, -0.25f); // Aresta Direita - vertice topo direito
		gl.glVertex2f(0.1f, -0.25f); // Aresta Topo - vertice topo direito
		gl.glVertex2f(0.0f, -0.25f); // Aresta Topo - vertice topo esquerdo
	
	gl.glEnd();
	
	gl.glBegin(GL2.GL_LINES); // Janela
	
		gl.glColor3f(0.0f, 0.0f, 0.0f); // Contorno da janela
		gl.glVertex2f(0.25f, -0.17f); // Aresta Esquerda - vertice topo esquerdo
		gl.glVertex2f(0.25f, -0.34f); // Aresta Esquerda - vertice base esquerdo
		gl.glVertex2f(0.25f, -0.34f); // Aresta Base - vertice base esquerdo
		gl.glVertex2f(0.37f, -0.34f); // Aresta Base - vertice base direito
		gl.glVertex2f(0.37f, -0.34f); // Aresta Direita - vertice base direito
		gl.glVertex2f(0.37f, -0.17f); // Aresta Direita - vertice topo direito
		gl.glVertex2f(0.37f, -0.17f); // Aresta Topo - vertice topo direito
		gl.glVertex2f(0.25f, -0.17f); // Aresta Topo - vertice topo esquerdo
		
		gl.glColor3f(0.0f, 0.0f, 0.0f); // Interno da janela
		gl.glVertex2f(0.31f, -0.17f); // Aresta Vertical
		gl.glVertex2f(0.31f, -0.34f); // Aresta Vertical
		gl.glVertex2f(0.25f, -0.25f); // Aresta Horizontal
		gl.glVertex2f(0.37f, -0.25f); // Aresta Horizontal
	
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

		Casinha basicframe = new Casinha();
		glcanvas.addGLEventListener(basicframe);
		
		glcanvas.setSize(1000, 700);
		
		final JFrame frame = new JFrame("Casinha");
		
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		
		frame.setVisible(true);
	}

}

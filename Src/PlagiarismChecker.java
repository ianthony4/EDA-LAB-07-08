import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class PlagiarismChecker {
	
	static List<String> listDocuments = new ArrayList<String>();
	static List<AVLTree<String>> trees= new ArrayList<AVLTree<String>>(); //Lista de arboles
	static String respuesta="";


	public PlagiarismChecker() {

	}

    public boolean loadFiles(String[] paths){

		Document d;
		for(String path: paths){
			if(listDocuments.contains(path)){
				continue;
			}
			d= new Document(path);
			trees.add(d.createAVL());
			listDocuments.add(path);
			if(trees.get(trees.size()-1)== null){
				return true;
			}
			System.out.println("Se agrego " + path);
		}
		return false;
	}
}
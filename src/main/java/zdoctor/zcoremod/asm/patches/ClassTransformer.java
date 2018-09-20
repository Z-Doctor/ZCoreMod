package zdoctor.zcoremod.asm.patches;

import java.util.HashMap;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public abstract class ClassTransformer {

	public static HashMap<String, ClassTransformer> classTransformers = new HashMap();

	/**
	 * 
	 * @param className       The class
	 * @param transformedName The obfuscated class name
	 */
	public ClassTransformer(String className) {
		System.out.println("Registering to Transformer: " + className);
		classTransformers.put(className, this);
	}

	public byte[] transform(byte[] basicClass) {
		ClassNode classNode = new ClassNode();
		ClassReader classReader = new ClassReader(basicClass);
		classReader.accept(classNode, ClassReader.SKIP_FRAMES);

		transform(classNode);

		ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
		classNode.accept(classWriter);
		return classWriter.toByteArray();
	}

	public abstract void transform(ClassNode classNode);
}

package zdoctor.zcoremod;

import net.minecraft.launchwrapper.IClassTransformer;
import zdoctor.zcoremod.asm.patches.ClassTransformer;

public class CoreModTransformer implements IClassTransformer {

	public static CoreModTransformer instance;
	private boolean hasInit = false;

	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) {
//		System.out.println("Class " + transformedName + ": " + name);
		if (ClassTransformer.classTransformers.containsKey(name)) {
			System.out.println("Transforming: " + name);
			return ClassTransformer.classTransformers.get(name).transform(basicClass);
		} else if (ClassTransformer.classTransformers.containsKey(transformedName)) {
			System.out.println("Transforming: " + transformedName);
			return ClassTransformer.classTransformers.get(transformedName).transform(basicClass);
		}
		return basicClass;
	}

}

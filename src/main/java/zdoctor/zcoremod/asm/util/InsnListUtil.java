package zdoctor.zcoremod.asm.util;

import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;

public class InsnListUtil {
	public static void addToEnd(MethodNode method, InsnList list) {
		method.instructions.insert(list);
	}

}

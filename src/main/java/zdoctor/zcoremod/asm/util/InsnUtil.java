package zdoctor.zcoremod.asm.util;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class InsnUtil {
	public static InsnList print(String text) {
		InsnList list = new InsnList();
		print(list, text);
		return list;
	}

	public static void print(InsnList list, String text) {
		FieldInsnNode getPrintStream = new FieldInsnNode(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		LdcInsnNode string = new LdcInsnNode(text);
		MethodInsnNode printLn = new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
				"(Ljava/lang/String;)V", false);

		list.add(getPrintStream);
		list.add(string);
		list.add(printLn);
	}

	public static void printObject(InsnList list) {
		FieldInsnNode getPrintStream = new FieldInsnNode(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		MethodInsnNode printLn = new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
				"(Ljava/lang/Object;)V", false);

		list.add(getPrintStream);
		list.add(printLn);
	}

	public static void printFloat(InsnList list) {
		FieldInsnNode getPrintStream = new FieldInsnNode(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		MethodInsnNode printLn = new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
				"(Ljava/lang/String;)V", false);

		list.add(getPrintStream);
		list.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "java/lang/Float", "toString", "(F)Ljava/lang/String;",
				false));
		list.add(printLn);
	}

}

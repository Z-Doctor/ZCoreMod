package zdoctor.zcoremod.asm.util;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class InsnBuilder extends InsnList {

	/**
	 * Adds new {@link InsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the instruction to be constructed. This opcode
	 *               must be NOP, ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1,
	 *               ICONST_2, ICONST_3, ICONST_4, ICONST_5, LCONST_0, LCONST_1,
	 *               FCONST_0, FCONST_1, FCONST_2, DCONST_0, DCONST_1, IALOAD,
	 *               LALOAD, FALOAD, DALOAD, AALOAD, BALOAD, CALOAD, SALOAD,
	 *               IASTORE, LASTORE, FASTORE, DASTORE, AASTORE, BASTORE, CASTORE,
	 *               SASTORE, POP, POP2, DUP, DUP_X1, DUP_X2, DUP2, DUP2_X1,
	 *               DUP2_X2, SWAP, IADD, LADD, FADD, DADD, ISUB, LSUB, FSUB, DSUB,
	 *               IMUL, LMUL, FMUL, DMUL, IDIV, LDIV, FDIV, DDIV, IREM, LREM,
	 *               FREM, DREM, INEG, LNEG, FNEG, DNEG, ISHL, LSHL, ISHR, LSHR,
	 *               IUSHR, LUSHR, IAND, LAND, IOR, LOR, IXOR, LXOR, I2L, I2F, I2D,
	 *               L2I, L2F, L2D, F2I, F2L, F2D, D2I, D2L, D2F, I2B, I2C, I2S,
	 *               LCMP, FCMPL, FCMPG, DCMPL, DCMPG, IRETURN, LRETURN, FRETURN,
	 *               DRETURN, ARETURN, RETURN, ARRAYLENGTH, ATHROW, MONITORENTER,
	 *               or MONITOREXIT.
	 */
	public void insn(int opcode) {
		add(new InsnNode(opcode));
	}

	/**
	 * Adds new {@link FieldInsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the type instruction to be constructed. This
	 *               opcode must be GETSTATIC, PUTSTATIC, GETFIELD or PUTFIELD.
	 * @param owner
	 *               the internal name of the field's owner class (see
	 *               {@link org.objectweb.asm.Type#getInternalName()
	 *               getInternalName}).
	 * @param name
	 *               the field's name.
	 * @param desc
	 *               the field's descriptor (see {@link org.objectweb.asm.Type}).
	 */
	public void field(int opcode, String owner, String name, String descriptor) {
		add(new FieldInsnNode(opcode, owner, name, descriptor));
	}

	/**
	 * Adds new {@link MethodInsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the type instruction to be constructed. This
	 *               opcode must be INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC or
	 *               INVOKEINTERFACE.
	 * @param owner
	 *               the internal name of the method's owner class (see
	 *               {@link org.objectweb.asm.Type#getInternalName()
	 *               getInternalName}).
	 * @param name
	 *               the method's name.
	 * @param desc
	 *               the method's descriptor (see {@link org.objectweb.asm.Type}).
	 * @param itf
	 *               if the method's owner class is an interface.
	 */
	public void method(int opcode, String owner, String name, String descriptor, boolean itf) {
		add(new MethodInsnNode(opcode, owner, name, descriptor, itf));
	}

	/**
	 * Adds new {@link TypeInsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the type instruction to be constructed. This
	 *               opcode must be NEW, ANEWARRAY, CHECKCAST or INSTANCEOF.
	 * @param desc
	 *               the operand of the instruction to be constructed. This operand
	 *               is an internal name (see {@link org.objectweb.asm.Type}).
	 */
	public void type(int opcode, String desc) {
		add(new TypeInsnNode(opcode, desc));
	}

	/**
	 * Adds new {@link VarInsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the local variable instruction to be
	 *               constructed. This opcode must be ILOAD, LLOAD, FLOAD, DLOAD,
	 *               ALOAD, ISTORE, LSTORE, FSTORE, DSTORE, ASTORE or RET.
	 * @param var
	 *               the operand of the instruction to be constructed. This operand
	 *               is the index of a local variable.
	 */
	public void var(int opcode, int varNum) {
		add(new VarInsnNode(opcode, varNum));
	}

	/**
	 * Adds new {@link IntInsnNode} to the list
	 * 
	 * @param opcode
	 *                the opcode of the instruction to be constructed. This opcode
	 *                must be BIPUSH, SIPUSH or NEWARRAY.
	 * @param operand
	 *                the operand of the instruction to be constructed.
	 */
	public void intInsn(int opcode, int operand) {
		add(new IntInsnNode(opcode, operand));
	}

	/**
	 * Adds new {@link JumpInsnNode} to the list
	 * 
	 * @param opcode
	 *               the opcode of the type instruction to be constructed. This
	 *               opcode must be IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE, IF_ICMPEQ,
	 *               IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE,
	 *               IF_ACMPEQ, IF_ACMPNE, GOTO, JSR, IFNULL or IFNONNULL.
	 * @param label
	 *               the operand of the instruction to be constructed. This operand
	 *               is a label that designates the instruction to which the jump
	 *               instruction may jump.
	 */
	public void jump(int opcode, LabelNode label) {
		add(new JumpInsnNode(opcode, label));
	}

	public void var(int opcode) {
		var(opcode, 0);
	}

	public void ldc(Object object) {
		add(new LdcInsnNode(object));
	}

	public void getField(String owner, String name, String descriptor) {
		field(Opcodes.GETFIELD, owner, name, descriptor);
	}

	public void getStatic(String owner, String name, String descriptor) {
		field(Opcodes.GETSTATIC, owner, name, descriptor);
	}

	public void putStatic(String owner, String name, String descriptor) {
		field(Opcodes.PUTSTATIC, owner, name, descriptor);
	}

	public void putField(String owner, String name, String descriptor) {
		field(Opcodes.PUTFIELD, owner, name, descriptor);
	}

	public void invokeVirtual(String owner, String name, String descriptor, boolean itf) {
		method(Opcodes.INVOKEVIRTUAL, owner, name, descriptor, itf);
	}

	public void invokeStatic(String owner, String name, String descriptor, boolean itf) {
		method(Opcodes.INVOKESTATIC, owner, name, descriptor, itf);
	}

	public void invokSpecial(String owner, String name, String descriptor, boolean itf) {
		method(Opcodes.INVOKESPECIAL, owner, name, descriptor, itf);
	}

	public void NEW(String desc) {
		type(Opcodes.NEW, desc);
	}

	public void newObjectArray() {
		// Assuming size is on the top of the stack
		type(Opcodes.ANEWARRAY, "java/lang/Object");
	}

	public void newObjectArray(int size) {
		push(size);
		newObjectArray();
	}

	public void addObject(int index) {
		// array
		// value

		// Assuming an array ref is on the top of the stack
		swap();

		// value
		// array
		dupx1();
		// array
		// value
		// array
		swap();
		push(index);
		swap();
		insn(Opcodes.AASTORE);
	}

	public void push(int num) {
		if (num < 0)
			ldc(new Integer(num));
		else if (num < 128)
			intInsn(Opcodes.BIPUSH, num);
		else if (num < 32768)
			intInsn(Opcodes.SIPUSH, num);
		else
			ldc(new Integer(num));
	}

	public void push(long num) {
		ldc(new Long(num));
	}

	public void push(float num) {
		ldc(num);
	}

	public void push(double num) {
		ldc(num);
	}

	public void nop() {
		insn(Opcodes.NOP);
	}

	public void pop() {
		insn(Opcodes.POP);
	}

	public void pop2() {
		insn(Opcodes.POP2);
	}

	public void dup() {
		insn(Opcodes.DUP);
	}

	public void dupx1() {
		insn(Opcodes.DUP_X1);
	}

	public void dupx2() {
		insn(Opcodes.DUP_X2);
	}

	public void dup2() {
		insn(Opcodes.DUP2);
	}

	public void dup2x1() {
		insn(Opcodes.DUP2_X1);
	}

	public void dup2x2() {
		insn(Opcodes.DUP2_X2);
	}

	public void swap() {
		insn(Opcodes.SWAP);
	}

	public void swap2() {
		dupx2();
		pop2();
	}

	public LabelNode newLabel() {
		LabelNode label = new LabelNode();
		add(label);
		return label;
	}

	public void addToEnd(MethodNode method) {
		method.instructions.insert(this);
	}

	public void addToStart(MethodNode method) {
		method.instructions.insert(method.instructions.getFirst(), this);
	}

	public void addTo(MethodNode method) {
		method.instructions.insert(this);
	}

	public void addAt(MethodNode method, AbstractInsnNode location) {
		method.instructions.insert(location, this);
	}

	public void addBefore(MethodNode method, AbstractInsnNode location) {
		method.instructions.insertBefore(location, this);
	}

	public void end() {
		insn(Opcodes.RETURN);
	}

	public void checkCast(String desc) {
		type(Opcodes.CHECKCAST, desc);
	}

	public void checkCastInt() {
		type(Opcodes.CHECKCAST, "java/lang/Integer");
	}

	public void checkCastLong() {
		type(Opcodes.CHECKCAST, "java/lang/Long");
	}

	public void checkCastFloat() {
		type(Opcodes.CHECKCAST, "java/lang/Float");
	}

	public void intValue() {
		invokeVirtual("java/lang/Integer", "intValue", "()I", false);
	}

	public void longValue() {
		invokeVirtual("java/lang/Long", "longValue", "()J", false);
	}

	public void floatValue() {
		invokeVirtual("java/lang/Float", "floatValue", "()F", false);
	}

	public void doubleValue() {
		invokeVirtual("java/lang/Double", "doubleValue", "()D", false);
	}

	public void checkCastDouble() {
		type(Opcodes.CHECKCAST, "java/lang/Double");
	}

	/**
	 * Converts the int on the stop of the stack to a {@link Integer}
	 */
	public void valueOfInt() {
		invokeStatic("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
	}

	/**
	 * Converts the long on the stop of the stack to a {@link Long}
	 */
	public void valueOfLong() {
		invokeStatic("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
	}

	/**
	 * Converts the float on the stop of the stack to a {@link Float}
	 */
	public void valueOfFloat() {
		invokeStatic("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
	}

	/**
	 * Converts the double on the stop of the stack to a {@link Double}
	 */
	public void valueOfDouble() {
		invokeStatic("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
	}

	/**
	 * Converts the int on the stop of the stack to a {@link Integer}
	 * 
	 * @param num Pushes the int to the stack
	 */
	public void valueOfInt(int num) {
		push(num);
		valueOfInt();
	}

	/**
	 * Converts the long on the stop of the stack to a {@link Long}
	 * 
	 * @param num Pushes the long to the stack
	 */
	public void valueOfLong(long num) {
		push(num);
		valueOfLong();
	}

	/**
	 * Converts the float on the top of the stack to a {@link Float}
	 * 
	 * @param num Pushes the float to the stack
	 */
	public void valueOfFloat(float num) {
		push(num);
		valueOfFloat();
	}

	/**
	 * Converts the double on the stop of the stack to a {@link Double}
	 * 
	 * @param num Pushes the double to the stack
	 */
	public void valueOfDouble(double num) {
		push(num);
		valueOfDouble();
	}

	/**
	 * Prints the current String on the stack
	 */
	public void print() {
		// Assuming the object is on the top of stack
		getStatic("java/lang/System", "out", "Ljava/io/PrintStream;");
		swap();
		invokeVirtual("java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
	}

	/**
	 * Prints the current String on the stack
	 * 
	 * @param text Pushes the String to the stack
	 */
	public void print(String text) {
		ldc(text);
		print();
	}

	/**
	 * Prints the current format String and the Object array on the stack
	 */
	public void printf() {
		invokeStatic("java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
		print();
	}

	/**
	 * Prints the current format String and the Object array on the stack
	 * 
	 * @param format The format String to push to the stack
	 * @param insn   Instructions that will load the objects to the stack to be
	 *               sorted
	 */
	public void printf(String format, InsnBuilder... insn) {
		ldc(format);
		newObjectArray(insn.length);
		for (int i = 0; i < insn.length; i++) {
			dup();
			push(i);
			add(insn[i]);
			insn(Opcodes.AASTORE);
		}
		printf();
	}

}

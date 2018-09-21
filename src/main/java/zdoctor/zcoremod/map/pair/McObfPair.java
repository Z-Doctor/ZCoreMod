package zdoctor.zcoremod.map.pair;

import java.util.ArrayList;

import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;

public class McObfPair {
	protected String obf;
	protected String deobf;
	protected String side = "";
	protected String comment = "";
	protected String owner = "";

	protected ArrayList<String> descriptors = new ArrayList<>();

	public McObfPair(String obf, String deobf) {
		this.obf = obf;
		this.deobf = deobf;
	}

	public McObfPair(String obf, String deobf, String side) {
		this.obf = obf;
		this.deobf = deobf;
		this.side = side;
	}

	public McObfPair(String obf, String deobf, String side, String comment) {
		this.obf = obf;
		this.deobf = deobf;
		this.side = side;
		this.comment = comment;
	}

	public String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return obf;
		else
			return deobf;
	}

	public String getObf() {
		return obf;
	}

	public String getDeobf() {
		return deobf;
	}

	public String getSide() {
		return side;
	}

	public String getComment() {
		return comment;
	}

	public String getDescriptor() {
		return getDescriptor(0);
	}

	public String getDescriptor(int index) {
		if (descriptors.isEmpty() || descriptors.size() <= index)
			return "";
		else
			return descriptors.get(index);
	}

	public String[] getDescriptors() {
		if (descriptors.isEmpty())
			return new String[] { "" };
		else
			return descriptors.toArray(new String[0]);
	}

	public void addDescriptor(String desc) {
		descriptors.add(desc);
	}

	public String getClassName() {
		return "";
	}

	public String getOwner() {
		return owner;
	}

	public boolean matches(MethodNode method) {
		return false;
	}

	public boolean matches(MethodInsnNode method) {
		return false;
	}

	public boolean matches(FieldNode field) {
		return false;
	}

	public boolean matches(FieldInsnNode field) {
		return false;
	}

	public String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public String getVariableName() {
		return getName();
	}

}
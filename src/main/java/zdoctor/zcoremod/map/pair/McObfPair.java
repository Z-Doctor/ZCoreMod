package zdoctor.zcoremod.map.pair;

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
		return "";
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
	
}
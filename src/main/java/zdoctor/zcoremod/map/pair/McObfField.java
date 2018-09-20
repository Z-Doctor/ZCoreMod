package zdoctor.zcoremod.map.pair;

import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;

public class McObfField extends McObfPair {
	protected String ownerObf;
	protected String ownerDeobf;
	protected String field;

	public McObfField(String obfField, String deobfField) {
		super(obfField, deobfField);
		
		this.field = deobfField.substring(deobfField.lastIndexOf('/') + 1);
		
		this.ownerObf = obfField.substring(0, obfField.lastIndexOf('/'));
		this.ownerDeobf = deobfField.substring(0, deobfField.lastIndexOf('/'));
	}

	@Override
	public String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return obf.substring(obf.lastIndexOf('/') + 1);
		else
			return deobf.substring(deobf.lastIndexOf('/') + 1);
	}
	
	@Override
	public String getOwner() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return ownerObf;
		else
			return ownerDeobf;
	}
	
	@Override
	public String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return obf;
		else
			return deobf;
	}

	@Override
	public boolean matches(FieldNode field) {
		return getName().equals(field.name);
	}
	
	@Override
	public boolean matches(FieldInsnNode field) {
		return getName().equals(field.name);
	}
}

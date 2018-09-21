package zdoctor.zcoremod.map.pair;

import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;

public class McObfMethod extends McObfPair {
	protected String ownerObf;
	protected String ownerDeobf;
	protected String functionNameObf;

	public McObfMethod(String ownerObf, String ownerDeobf, String functionNameObf, String descObf, String descDeobf) {
		super(descObf, descDeobf);

		this.ownerObf = ownerObf;
		this.ownerDeobf = ownerDeobf;

		if (CoreModFMLLoadPlugin.isObfuscated)
			addDescriptor(descObf);
		else
			addDescriptor(descDeobf);

		this.functionNameObf = functionNameObf.substring(functionNameObf.lastIndexOf('/') + 1);
	}

	@Override
	public String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return functionNameObf;
		else
			return ownerDeobf.substring(ownerDeobf.lastIndexOf('/') + 1);

	}

	@Override
	public String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return ownerObf;
		else
			return ownerDeobf;
	}

	@Override
	public String getOwner() {
		return getClassName().substring(0, getClassName().lastIndexOf('/'));
	}

	@Override
	public String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return obf;
		else
			return deobf;
	}

	@Override
	public boolean matches(MethodNode method) {
		return getName().equals(method.name) && getDescriptor().equals(method.desc);
	}

	@Override
	public boolean matches(MethodInsnNode method) {
		return getName().equals(method.name) && getDescriptor().equals(method.desc);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getVariableName() {
		return ownerDeobf.substring(ownerDeobf.lastIndexOf('/') + 1);
	}
}

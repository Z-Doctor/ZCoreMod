package zdoctor.zcoremod.map.pair;

import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;

public class McObfMethod extends McObfPair {
	private String ownerObf;
	protected String ownerDeobf;
	
	public McObfMethod(String ownerObf, String ownerDeobf, String srgFunc, String descObf, String descDeobf) {
		super(descObf, descDeobf);
		
		this.ownerObf = ownerObf;
		this.ownerDeobf = ownerDeobf;
	}

	@Override
	public String getName() {
		return getClassName().substring(getClassName().lastIndexOf('/') + 1);
	}
	
	@Override
	public String getClassName() {
		if (CoreModFMLLoadPlugin.isObf)
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
		if (CoreModFMLLoadPlugin.isObf)
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
}

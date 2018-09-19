package zdoctor.zcoremod.map.pair;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;

public class McObfClass extends McObfPair {
	public String name;

	public McObfClass(String obf, String deobf) {
		super(obf, deobf);

		deobf = deobf.substring(deobf.lastIndexOf('/') + 1);
		this.name = deobf;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getClassName() {
		if (CoreModFMLLoadPlugin.isObf)
			return obf;
		else
			return deobf;
	}
	
	@Override
	public String getDescriptor() {
		return "L" + getClassName() + ";";
	}
}

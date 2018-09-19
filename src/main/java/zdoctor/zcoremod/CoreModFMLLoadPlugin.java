package zdoctor.zcoremod;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLCallHook;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zdoctor.zcoremod.asm.patches.ClassTransformers;
import zdoctor.zcoremod.map.McMappingDatabase;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.TransformerExclusions({ "zdoctor.zcoremod" })
@IFMLLoadingPlugin.Name("ZCoreMod.Plugin")
public class CoreModFMLLoadPlugin implements IFMLLoadingPlugin, IFMLCallHook {

	public static Boolean isObf = false;

	@Override
	public Void call() throws Exception {
		ClassTransformers.init();
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[] { CoreModTransformer.class.getName() };
	}

	@Override
	public String getModContainerClass() {
		return CoreModContainer.class.getName();
	}

	@Override
	public String getSetupClass() {
		return getClass().getName();
	}

	@Override
	public void injectData(Map<String, Object> data) {
		isObf = (Boolean) data.get("runtimeDeobfuscationEnabled");

		System.out.println("Loading Default Mappings");
		McMappingDatabase.loadDefaultMappings();
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}

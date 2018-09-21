package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITemplateProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bci";
		else
			return "net/minecraft/world/gen/structure/template/ITemplateProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bci";
		else
			return "ITemplateProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbci;";
		else
			return "Lnet/minecraft/world/gen/structure/template/ITemplateProcessor;";
	}

	/**
	 * <p>
	 * Name: processBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;)Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;]
	 * </p>
	 */
	public static McObfPair func_189943_a = McMappingDatabase.getSRG("ITemplateProcessor.func_189943_a");

}

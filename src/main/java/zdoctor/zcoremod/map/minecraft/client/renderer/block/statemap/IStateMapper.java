package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IStateMapper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bws";
		else
			return "net/minecraft/client/renderer/block/statemap/IStateMapper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bws";
		else
			return "IStateMapper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbws;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/IStateMapper;";
	}

	/**
	 * <p>
	 * Name: putStateModelLocations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178130_a = McMappingDatabase.getSRG("IStateMapper.func_178130_a");

}

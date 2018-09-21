package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Multipart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwi";
		else
			return "net/minecraft/client/renderer/block/model/multipart/Multipart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwi";
		else
			return "Multipart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwi;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/Multipart;";
	}

	/**
	 * <p>
	 * Name: getStateContainer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_188135_c = McMappingDatabase.getSRG("Multipart.func_188135_c");

	/**
	 * <p>
	 * Name: getVariants
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_188137_b = McMappingDatabase.getSRG("Multipart.func_188137_b");

	/**
	 * <p>
	 * Name: selectors
	 * </p>
	 */
	public static McObfPair field_188139_a = McMappingDatabase.getSRG("field_188139_a");

	/**
	 * <p>
	 * Name: setStateContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)V]
	 * </p>
	 */
	public static McObfPair func_188138_a = McMappingDatabase.getSRG("Multipart.func_188138_a");

	/**
	 * <p>
	 * Name: getSelectors
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188136_a = McMappingDatabase.getSRG("Multipart.func_188136_a");

	/**
	 * <p>
	 * Name: stateContainer
	 * </p>
	 */
	public static McObfPair field_188140_b = McMappingDatabase.getSRG("field_188140_b");

}

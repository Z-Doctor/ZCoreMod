package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetVisibility {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxv";
		else
			return "net/minecraft/client/renderer/chunk/SetVisibility";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxv";
		else
			return "SetVisibility";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxv;";
		else
			return "Lnet/minecraft/client/renderer/chunk/SetVisibility;";
	}

	/**
	 * <p>
	 * Name: bitSet
	 * </p>
	 */
	public static McObfPair field_178622_b = McMappingDatabase.getSRG("field_178622_b");

	/**
	 * <p>
	 * Name: setAllVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178618_a = McMappingDatabase.getSRG("SetVisibility.func_178618_a");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_178621_a = McMappingDatabase.getSRG("SetVisibility.func_178621_a");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Z)V]
	 * </p>
	 */
	public static McObfPair func_178619_a = McMappingDatabase.getSRG("SetVisibility.func_178619_a");

	/**
	 * <p>
	 * Name: setManyVisible
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Set;)V]
	 * </p>
	 */
	public static McObfPair func_178620_a = McMappingDatabase.getSRG("SetVisibility.func_178620_a");

	/**
	 * <p>
	 * Name: COUNT_FACES
	 * </p>
	 */
	public static McObfPair field_178623_a = McMappingDatabase.getSRG("field_178623_a");

}

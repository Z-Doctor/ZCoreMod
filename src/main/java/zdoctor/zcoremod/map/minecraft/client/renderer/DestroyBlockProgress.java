package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DestroyBlockProgress {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oh";
		else
			return "net/minecraft/client/renderer/DestroyBlockProgress";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oh";
		else
			return "DestroyBlockProgress";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loh;";
		else
			return "Lnet/minecraft/client/renderer/DestroyBlockProgress;";
	}

	/**
	 * <p>
	 * Name: createdAtCloudUpdateTick
	 * </p>
	 */
	public static McObfPair field_82745_f = McMappingDatabase.getSRG("field_82745_f");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180246_b = McMappingDatabase.getSRG("DestroyBlockProgress.func_180246_b");

	/**
	 * <p>
	 * Name: getPartialBlockDamage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_73106_e = McMappingDatabase.getSRG("DestroyBlockProgress.func_73106_e");

	/**
	 * <p>
	 * Name: setPartialBlockDamage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_73107_a = McMappingDatabase.getSRG("DestroyBlockProgress.func_73107_a");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_180247_b = McMappingDatabase.getSRG("field_180247_b");

	/**
	 * <p>
	 * Name: getCreationCloudUpdateTick
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82743_f = McMappingDatabase.getSRG("DestroyBlockProgress.func_82743_f");

	/**
	 * <p>
	 * Name: partialBlockProgress
	 * </p>
	 */
	public static McObfPair field_73112_e = McMappingDatabase.getSRG("field_73112_e");

	/**
	 * <p>
	 * Name: miningPlayerEntId
	 * </p>
	 */
	public static McObfPair field_73115_a = McMappingDatabase.getSRG("field_73115_a");

	/**
	 * <p>
	 * Name: setCloudUpdateTick
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82744_b = McMappingDatabase.getSRG("DestroyBlockProgress.func_82744_b");

}

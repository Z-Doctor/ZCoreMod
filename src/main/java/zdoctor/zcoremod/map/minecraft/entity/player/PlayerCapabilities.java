package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerCapabilities {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeb";
		else
			return "net/minecraft/entity/player/PlayerCapabilities";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeb";
		else
			return "PlayerCapabilities";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeb;";
		else
			return "Lnet/minecraft/entity/player/PlayerCapabilities;";
	}

	/**
	 * <p>
	 * Name: readCapabilitiesFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75095_b = McMappingDatabase.getSRG("PlayerCapabilities.func_75095_b");

	/**
	 * <p>
	 * Name: allowEdit
	 * </p>
	 */
	public static McObfPair field_75099_e = McMappingDatabase.getSRG("field_75099_e");

	/**
	 * <p>
	 * Name: walkSpeed
	 * </p>
	 */
	public static McObfPair field_75097_g = McMappingDatabase.getSRG("field_75097_g");

	/**
	 * <p>
	 * Name: writeCapabilitiesToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75091_a = McMappingDatabase.getSRG("PlayerCapabilities.func_75091_a");

	/**
	 * <p>
	 * Name: getWalkSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_75094_b = McMappingDatabase.getSRG("PlayerCapabilities.func_75094_b");

	/**
	 * <p>
	 * Name: setPlayerWalkSpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_82877_b = McMappingDatabase.getSRG("PlayerCapabilities.func_82877_b");

	/**
	 * <p>
	 * Name: flySpeed
	 * </p>
	 */
	public static McObfPair field_75096_f = McMappingDatabase.getSRG("field_75096_f");

	/**
	 * <p>
	 * Name: allowFlying
	 * </p>
	 */
	public static McObfPair field_75101_c = McMappingDatabase.getSRG("field_75101_c");

	/**
	 * <p>
	 * Name: isFlying
	 * </p>
	 */
	public static McObfPair field_75100_b = McMappingDatabase.getSRG("field_75100_b");

	/**
	 * <p>
	 * Name: setFlySpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_75092_a = McMappingDatabase.getSRG("PlayerCapabilities.func_75092_a");

	/**
	 * <p>
	 * Name: getFlySpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_75093_a = McMappingDatabase.getSRG("PlayerCapabilities.func_75093_a");

	/**
	 * <p>
	 * Name: isCreativeMode
	 * </p>
	 */
	public static McObfPair field_75098_d = McMappingDatabase.getSRG("field_75098_d");

	/**
	 * <p>
	 * Name: disableDamage
	 * </p>
	 */
	public static McObfPair field_75102_a = McMappingDatabase.getSRG("field_75102_a");

}

package zdoctor.zcoremod.map.minecraft.client.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityOtherPlayerMP {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bue";
		else
			return "net/minecraft/client/entity/EntityOtherPlayerMP";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bue";
		else
			return "EntityOtherPlayerMP";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbue;";
		else
			return "Lnet/minecraft/client/entity/EntityOtherPlayerMP;";
	}

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_145747_a");

	/**
	 * <p>
	 * Name: otherPlayerMPX
	 * </p>
	 */
	public static McObfPair field_71185_c = McMappingDatabase.getSRG("field_71185_c");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_70097_a");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_70003_b");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_180426_a");

	/**
	 * <p>
	 * Name: otherPlayerMPYaw
	 * </p>
	 */
	public static McObfPair field_71180_f = McMappingDatabase.getSRG("field_71180_f");

	/**
	 * <p>
	 * Name: otherPlayerMPY
	 * </p>
	 */
	public static McObfPair field_71182_d = McMappingDatabase.getSRG("field_71182_d");

	/**
	 * <p>
	 * Name: otherPlayerMPPosRotationIncrements
	 * </p>
	 */
	public static McObfPair field_71184_b = McMappingDatabase.getSRG("field_71184_b");

	/**
	 * <p>
	 * Name: otherPlayerMPZ
	 * </p>
	 */
	public static McObfPair field_71183_e = McMappingDatabase.getSRG("field_71183_e");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_70071_h_");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_180425_c");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_70636_d");

	/**
	 * <p>
	 * Name: otherPlayerMPPitch
	 * </p>
	 */
	public static McObfPair field_71181_g = McMappingDatabase.getSRG("field_71181_g");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityOtherPlayerMP.func_70112_a");

}

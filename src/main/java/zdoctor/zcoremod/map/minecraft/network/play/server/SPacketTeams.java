package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketTeams {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kl";
		else
			return "net/minecraft/network/play/server/SPacketTeams";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kl";
		else
			return "SPacketTeams";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkl;";
		else
			return "Lnet/minecraft/network/play/server/SPacketTeams;";
	}

	/**
	 * <p>
	 * Name: getPrefix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149311_e = McMappingDatabase.getSRG("SPacketTeams.func_149311_e");

	/**
	 * <p>
	 * Name: friendlyFlags
	 * </p>
	 */
	public static McObfPair field_149315_g = McMappingDatabase.getSRG("field_149315_g");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179813_h = McMappingDatabase.getSRG("SPacketTeams.func_179813_h");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_149318_b = McMappingDatabase.getSRG("field_149318_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketTeams.func_148833_a");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149307_h = McMappingDatabase.getSRG("SPacketTeams.func_149307_h");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_179815_f = McMappingDatabase.getSRG("field_179815_f");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_149310_g = McMappingDatabase.getSRG("SPacketTeams.func_149310_g");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_149320_a = McMappingDatabase.getSRG("field_149320_a");

	/**
	 * <p>
	 * Name: collisionRule
	 * </p>
	 */
	public static McObfPair field_186976_f = McMappingDatabase.getSRG("field_186976_f");

	/**
	 * <p>
	 * Name: nameTagVisibility
	 * </p>
	 */
	public static McObfPair field_179816_e = McMappingDatabase.getSRG("field_179816_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketTeams.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketTeams.func_148837_a");

	/**
	 * <p>
	 * Name: getCollisionRule
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186975_j = McMappingDatabase.getSRG("SPacketTeams.func_186975_j");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149312_c = McMappingDatabase.getSRG("SPacketTeams.func_149312_c");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149306_d = McMappingDatabase.getSRG("SPacketTeams.func_149306_d");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_149317_e = McMappingDatabase.getSRG("field_149317_e");

	/**
	 * <p>
	 * Name: getSuffix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149309_f = McMappingDatabase.getSRG("SPacketTeams.func_149309_f");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149314_f = McMappingDatabase.getSRG("field_149314_f");

	/**
	 * <p>
	 * Name: getNameTagVisibility
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179814_i = McMappingDatabase.getSRG("SPacketTeams.func_179814_i");

	/**
	 * <p>
	 * Name: getFriendlyFlags
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149308_i = McMappingDatabase.getSRG("SPacketTeams.func_149308_i");

	/**
	 * <p>
	 * Name: prefix
	 * </p>
	 */
	public static McObfPair field_149319_c = McMappingDatabase.getSRG("field_149319_c");

	/**
	 * <p>
	 * Name: suffix
	 * </p>
	 */
	public static McObfPair field_149316_d = McMappingDatabase.getSRG("field_149316_d");

}

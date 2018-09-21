package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketRecipeInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ls";
		else
			return "net/minecraft/network/play/client/CPacketRecipeInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ls";
		else
			return "CPacketRecipeInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lls;";
		else
			return "Lnet/minecraft/network/play/client/CPacketRecipeInfo;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketRecipeInfo.func_148833_a");

	/**
	 * <p>
	 * Name: getRecipe
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193648_b = McMappingDatabase.getSRG("CPacketRecipeInfo.func_193648_b");

	/**
	 * <p>
	 * Name: isGuiOpen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192624_c = McMappingDatabase.getSRG("CPacketRecipeInfo.func_192624_c");

	/**
	 * <p>
	 * Name: isFilteringCraftable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192625_d = McMappingDatabase.getSRG("CPacketRecipeInfo.func_192625_d");

	/**
	 * <p>
	 * Name: getPurpose
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketRecipeInfo$Purpose;]
	 * </p>
	 */
	public static McObfPair func_194156_a = McMappingDatabase.getSRG("CPacketRecipeInfo.func_194156_a");

	/**
	 * <p>
	 * Name: recipe
	 * </p>
	 */
	public static McObfPair field_193649_d = McMappingDatabase.getSRG("field_193649_d");

	/**
	 * <p>
	 * Name: isGuiOpen
	 * </p>
	 */
	public static McObfPair field_192631_e = McMappingDatabase.getSRG("field_192631_e");

	/**
	 * <p>
	 * Name: purpose
	 * </p>
	 */
	public static McObfPair field_194157_a = McMappingDatabase.getSRG("field_194157_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketRecipeInfo.func_148837_a");

	/**
	 * <p>
	 * Name: filteringCraftable
	 * </p>
	 */
	public static McObfPair field_192632_f = McMappingDatabase.getSRG("field_192632_f");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketRecipeInfo.func_148840_b");

}

package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeBookServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qm";
		else
			return "net/minecraft/stats/RecipeBookServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qm";
		else
			return "RecipeBookServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqm;";
		else
			return "Lnet/minecraft/stats/RecipeBookServer;";
	}

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_192825_a = McMappingDatabase.getSRG("RecipeBookServer.func_192825_a");

	/**
	 * <p>
	 * Name: getDisplayedRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194080_e = McMappingDatabase.getSRG("RecipeBookServer.func_194080_e");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_193835_a = McMappingDatabase.getSRG("RecipeBookServer.func_193835_a");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_192826_c = McMappingDatabase.getSRG("RecipeBookServer.func_192826_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192828_d = McMappingDatabase.getSRG("field_192828_d");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_193834_b = McMappingDatabase.getSRG("RecipeBookServer.func_193834_b");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_192824_e = McMappingDatabase.getSRG("RecipeBookServer.func_192824_e");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194079_d = McMappingDatabase.getSRG("RecipeBookServer.func_194079_d");

	/**
	 * <p>
	 * Name: sendPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketRecipeBook$State;Lnet/minecraft/entity/player/EntityPlayerMP;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_194081_a = McMappingDatabase.getSRG("RecipeBookServer.func_194081_a");

}

package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartEmpty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afk";
		else
			return "net/minecraft/entity/item/EntityMinecartEmpty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afk";
		else
			return "EntityMinecartEmpty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafk;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartEmpty;";
	}

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartEmpty.func_184264_v");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityMinecartEmpty.func_184230_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartEmpty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189673_a = McMappingDatabase.getSRG("EntityMinecartEmpty.func_189673_a");

	/**
	 * <p>
	 * Name: onActivatorRailPass
	 * </p>
	 * <p>
	 * Desc: [(IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_96095_a = McMappingDatabase.getSRG("EntityMinecartEmpty.func_96095_a");

}

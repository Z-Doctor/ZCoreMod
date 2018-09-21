package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartCommandBlock$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afg$1";
		else
			return "net/minecraft/entity/item/EntityMinecartCommandBlock$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afg$1";
		else
			return "EntityMinecartCommandBlock$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafg$1;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartCommandBlock$1;";
	}

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_130014_f_");

	/**
	 * <p>
	 * Name: fillInInfo
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_145757_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_145757_a");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_180425_c");

	/**
	 * <p>
	 * Name: getCommandBlockType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145751_f = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_145751_f");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_184102_h");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_174791_d");

	/**
	 * <p>
	 * Name: updateCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145756_e = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_145756_e");

	/**
	 * <p>
	 * Name: getCommandSenderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_174793_f = McMappingDatabase.getSRG("EntityMinecartCommandBlock$1.func_174793_f");

}

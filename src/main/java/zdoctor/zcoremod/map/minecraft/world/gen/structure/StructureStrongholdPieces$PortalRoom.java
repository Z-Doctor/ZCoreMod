package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$PortalRoom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$g";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$g";
		else
			return "StructureStrongholdPieces$PortalRoom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$g;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom;";
	}

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PortalRoom.func_74861_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureStrongholdPieces$PortalRoom.func_143011_b");

	/**
	 * <p>
	 * Name: hasSpawner
	 * </p>
	 */
	public static McObfPair field_75005_a = McMappingDatabase.getSRG("field_75005_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PortalRoom.func_74875_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PortalRoom.func_143012_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom;]
	 * </p>
	 */
	public static McObfPair func_175865_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PortalRoom.func_175865_a");

}

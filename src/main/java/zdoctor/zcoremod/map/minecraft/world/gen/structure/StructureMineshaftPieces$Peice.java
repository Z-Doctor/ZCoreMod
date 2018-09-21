package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureMineshaftPieces$Peice {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$c";
		else
			return "net/minecraft/world/gen/structure/StructureMineshaftPieces$Peice";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$c";
		else
			return "StructureMineshaftPieces$Peice";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbk$c;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Peice;";
	}

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureMineshaftPieces$Peice.func_143011_b");

	/**
	 * <p>
	 * Name: getFenceBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_189919_b = McMappingDatabase.getSRG("StructureMineshaftPieces$Peice.func_189919_b");

	/**
	 * <p>
	 * Name: mineShaftType
	 * </p>
	 */
	public static McObfPair field_189920_a = McMappingDatabase.getSRG("field_189920_a");

	/**
	 * <p>
	 * Name: getPlanksBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_189917_F_ = McMappingDatabase.getSRG("StructureMineshaftPieces$Peice.func_189917_F_");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Peice.func_143012_a");

	/**
	 * <p>
	 * Name: isSupportingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIII)Z]
	 * </p>
	 */
	public static McObfPair func_189918_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Peice.func_189918_a");

}

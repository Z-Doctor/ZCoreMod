package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$RoomDefinition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$v";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$v";
		else
			return "StructureOceanMonumentPieces$RoomDefinition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$v;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition;";
	}

	/**
	 * <p>
	 * Name: connections
	 * </p>
	 */
	public static McObfPair field_175965_b = McMappingDatabase.getSRG("field_175965_b");

	/**
	 * <p>
	 * Name: isSource
	 * </p>
	 */
	public static McObfPair field_175964_e = McMappingDatabase.getSRG("field_175964_e");

	/**
	 * <p>
	 * Name: claimed
	 * </p>
	 */
	public static McObfPair field_175963_d = McMappingDatabase.getSRG("field_175963_d");

	/**
	 * <p>
	 * Name: hasOpening
	 * </p>
	 */
	public static McObfPair field_175966_c = McMappingDatabase.getSRG("field_175966_c");

	/**
	 * <p>
	 * Name: isSpecial
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175961_b = McMappingDatabase.getSRG("StructureOceanMonumentPieces$RoomDefinition.func_175961_b");

	/**
	 * <p>
	 * Name: scanIndex
	 * </p>
	 */
	public static McObfPair field_175962_f = McMappingDatabase.getSRG("field_175962_f");

	/**
	 * <p>
	 * Name: setConnection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition;)V]
	 * </p>
	 */
	public static McObfPair func_175957_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$RoomDefinition.func_175957_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_175967_a = McMappingDatabase.getSRG("field_175967_a");

	/**
	 * <p>
	 * Name: countOpenings
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175960_c = McMappingDatabase.getSRG("StructureOceanMonumentPieces$RoomDefinition.func_175960_c");

	/**
	 * <p>
	 * Name: findSource
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175959_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$RoomDefinition.func_175959_a");

	/**
	 * <p>
	 * Name: updateOpenings
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175958_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$RoomDefinition.func_175958_a");

}

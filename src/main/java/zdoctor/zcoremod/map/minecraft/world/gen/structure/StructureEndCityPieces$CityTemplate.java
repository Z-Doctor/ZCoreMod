package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureEndCityPieces$CityTemplate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$a";
		else
			return "net/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$a";
		else
			return "StructureEndCityPieces$CityTemplate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbi$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;";
	}

	/**
	 * <p>
	 * Name: handleDataMarker
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_186175_a = McMappingDatabase.getSRG("StructureEndCityPieces$CityTemplate.func_186175_a");

	/**
	 * <p>
	 * Name: loadTemplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_191085_a = McMappingDatabase.getSRG("StructureEndCityPieces$CityTemplate.func_191085_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureEndCityPieces$CityTemplate.func_143012_a");

	/**
	 * <p>
	 * Name: overwrite
	 * </p>
	 */
	public static McObfPair field_186183_f = McMappingDatabase.getSRG("field_186183_f");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureEndCityPieces$CityTemplate.func_143011_b");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_186182_e = McMappingDatabase.getSRG("field_186182_e");

	/**
	 * <p>
	 * Name: pieceName
	 * </p>
	 */
	public static McObfPair field_186181_d = McMappingDatabase.getSRG("field_186181_d");

}

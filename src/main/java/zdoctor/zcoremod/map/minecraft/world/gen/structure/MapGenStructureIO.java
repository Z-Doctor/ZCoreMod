package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenStructureIO {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbv";
		else
			return "net/minecraft/world/gen/structure/MapGenStructureIO";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbv";
		else
			return "MapGenStructureIO";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbv;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenStructureIO;";
	}

	/**
	 * <p>
	 * Name: startClassToNameMap
	 * </p>
	 */
	public static McObfPair field_143038_b = McMappingDatabase.getSRG("field_143038_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151687_a = McMappingDatabase.getSRG("field_151687_a");

	/**
	 * <p>
	 * Name: getStructureComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_143032_b = McMappingDatabase.getSRG("MapGenStructureIO.func_143032_b");

	/**
	 * <p>
	 * Name: getStructureComponentName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143036_a = McMappingDatabase.getSRG("MapGenStructureIO.func_143036_a");

	/**
	 * <p>
	 * Name: componentNameToClassMap
	 * </p>
	 */
	public static McObfPair field_143039_c = McMappingDatabase.getSRG("field_143039_c");

	/**
	 * <p>
	 * Name: registerStructureComponent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_143031_a = McMappingDatabase.getSRG("MapGenStructureIO.func_143031_a");

	/**
	 * <p>
	 * Name: getStructureStartName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStart;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143033_a = McMappingDatabase.getSRG("MapGenStructureIO.func_143033_a");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_143035_a = McMappingDatabase.getSRG("MapGenStructureIO.func_143035_a");

	/**
	 * <p>
	 * Name: registerStructure
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_143034_b = McMappingDatabase.getSRG("MapGenStructureIO.func_143034_b");

	/**
	 * <p>
	 * Name: startNameToClassMap
	 * </p>
	 */
	public static McObfPair field_143040_a = McMappingDatabase.getSRG("field_143040_a");

	/**
	 * <p>
	 * Name: componentClassToNameMap
	 * </p>
	 */
	public static McObfPair field_143037_d = McMappingDatabase.getSRG("field_143037_d");

}

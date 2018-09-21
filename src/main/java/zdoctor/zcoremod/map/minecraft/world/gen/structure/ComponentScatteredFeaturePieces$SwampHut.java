package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$SwampHut {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$e";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$e";
		else
			return "ComponentScatteredFeaturePieces$SwampHut";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$e;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut;";
	}

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$SwampHut.func_74875_a");

	/**
	 * <p>
	 * Name: hasWitch
	 * </p>
	 */
	public static McObfPair field_82682_h = McMappingDatabase.getSRG("field_82682_h");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$SwampHut.func_143012_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$SwampHut.func_143011_b");

}

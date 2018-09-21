package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qo";
		else
			return "net/minecraft/stats/StatBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qo";
		else
			return "StatBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqo;";
		else
			return "Lnet/minecraft/stats/StatBase;";
	}

	/**
	 * <p>
	 * Name: decimalFormat
	 * </p>
	 */
	public static McObfPair field_75974_d = McMappingDatabase.getSRG("field_75974_d");

	/**
	 * <p>
	 * Name: objectiveCriteria
	 * </p>
	 */
	public static McObfPair field_150957_c = McMappingDatabase.getSRG("field_150957_c");

	/**
	 * <p>
	 * Name: formatter
	 * </p>
	 */
	public static McObfPair field_75976_b = McMappingDatabase.getSRG("field_75976_b");

	/**
	 * <p>
	 * Name: getSerializableClazz
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_150954_l = McMappingDatabase.getSRG("StatBase.func_150954_l");

	/**
	 * <p>
	 * Name: format
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75968_a = McMappingDatabase.getSRG("StatBase.func_75968_a");

	/**
	 * <p>
	 * Name: numberFormat
	 * </p>
	 */
	public static McObfPair field_75977_c = McMappingDatabase.getSRG("field_75977_c");

	/**
	 * <p>
	 * Name: timeStatType
	 * </p>
	 */
	public static McObfPair field_75981_i = McMappingDatabase.getSRG("field_75981_i");

	/**
	 * <p>
	 * Name: distanceStatType
	 * </p>
	 */
	public static McObfPair field_75979_j = McMappingDatabase.getSRG("field_75979_j");

	/**
	 * <p>
	 * Name: getStatName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150951_e = McMappingDatabase.getSRG("StatBase.func_150951_e");

	/**
	 * <p>
	 * Name: statId
	 * </p>
	 */
	public static McObfPair field_75975_e = McMappingDatabase.getSRG("field_75975_e");

	/**
	 * <p>
	 * Name: getCriteria
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria;]
	 * </p>
	 */
	public static McObfPair func_150952_k = McMappingDatabase.getSRG("StatBase.func_150952_k");

	/**
	 * <p>
	 * Name: serializableClazz
	 * </p>
	 */
	public static McObfPair field_150956_d = McMappingDatabase.getSRG("field_150956_d");

	/**
	 * <p>
	 * Name: divideByTen
	 * </p>
	 */
	public static McObfPair field_111202_k = McMappingDatabase.getSRG("field_111202_k");

	/**
	 * <p>
	 * Name: initIndependentStat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_75966_h = McMappingDatabase.getSRG("StatBase.func_75966_h");

	/**
	 * <p>
	 * Name: isIndependent
	 * </p>
	 */
	public static McObfPair field_75972_f = McMappingDatabase.getSRG("field_75972_f");

	/**
	 * <p>
	 * Name: simpleStatType
	 * </p>
	 */
	public static McObfPair field_75980_h = McMappingDatabase.getSRG("field_75980_h");

	/**
	 * <p>
	 * Name: registerStat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_75971_g = McMappingDatabase.getSRG("StatBase.func_75971_g");

	/**
	 * <p>
	 * Name: statName
	 * </p>
	 */
	public static McObfPair field_75978_a = McMappingDatabase.getSRG("field_75978_a");

}

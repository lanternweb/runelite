import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class83 {
	@ObfuscatedName("c")
	static final BigInteger field1151;
	@ObfuscatedName("t")
	static final BigInteger RSA;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1334117913
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	static {
		field1151 = new BigInteger("10001", 16);
		RSA = new BigInteger("9de5ff39242daeb38ea5ff4428e2c1c99b1dabddd3ba2ddad49f8ae2c6ebd71f8545384407ad434841f7a3487f2e9ad35b9d3f603d6d60729910b80173aec94b83d7059936d0503ef1ce62204a5ea4b191643bf908f500ee23bdc985fe24192d8c14fb61775406418b4ed2cbff0603da4369e14f1ae2a2aec0cd7778c364a553d301fc4ab6456dcc96ee685af0e262e521dc29937f0bf41068c5af71b4dddf28b0dbbdd2066fb4799e17930c95e6677a78fa91f74d55e54b662c30c5cf09cf34c32a78001c6a12638d0c856b9fb0af3895bbe11e154a534d7b12cf9f9bc777e5237363aa836f844d8dc534e25298248075a1774d0e3d46e4e7b0a6111ac3248d", 16);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Lii;I)V",
		garbageValue = "590815960"
	)
	public static void method2109(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)[Lgy;",
		garbageValue = "1"
	)
	public static class185[] method2107() {
		return new class185[]{class185.field2327, class185.field2315, class185.field2322, class185.field2317, class185.field2318, class185.field2320, class185.field2319, class185.field2314, class185.field2316, class185.field2323};
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "17386837"
	)
	public static int method2108(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lia;II)V",
		garbageValue = "319200175"
	)
	static void method2110(Archive var0, int var1) {
		if (class4.NetCache_reference != null) {
			class4.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = class4.NetCache_reference.readInt();
			int var3 = class4.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			BuddyRankComparator.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}
}

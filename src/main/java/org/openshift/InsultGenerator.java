package org.openshift;

import java.util.Random;

public class InsultGenerator {
	public String generateInsult() {
		String words[][] = {{"Artless", "Bawdy", "Beslubbering", "Bootless", "Churlish", "Cockered", "Clouted", "Craven", "Currish", "Dankish", "Dissembling", "Droning", "Errant", "Fawning", "Fobbing", "Froward", "Frothy", "Gleeking", "Goatish", "Gorbellied", "Impertinent", "Infectious", "Jarring", "Loggerheaded", "Lumpish", "Mammering", "Mangled", "Mewling", "Paunchy", "Pribbling", "Puking", "Puny", "Quailing", "Rank", "Reeky", "Roguish", "Ruttish", "Saucy", "Spleeny", "Spongy", "Surly", "Tottering", "Unmuzzled", "Vain", "Venomed", "Villainous", "Warped", "Wayward", "Weedy", "Yeasty"}, {"Base-court", "Bat-fowling", "Beef-witted", "Beetle-headed", "Boil-brained", "Clapper-clawed", "Clay-brained", "Common-kissing", "Crook-pated", "Dismal-dreaming", "Dizzy-eyed", "Dog-hearted", "Dread-bolted", "Earth-vexing", "Elf-skinned", "Fat-kidneyed", "Fen-sucked", "Flap-mouthed", "Fly-bitten", "Folly-fallen", "Fool-born", "Full-gorged", "Guts-griping", "Half-faced", "Hasty-witted", "Hedge-born", "Hell-hated", "Idle-headed", "Ill-breeding", "Ill-nurtured", "Knotty-pated", "Milk-livered", "Motley-minded", "Onion-eyed", "Plume-plucked", "Pottle-deep", "Pox-marked", "Reeling-ripe", "Rough-hewn","Rude-growing", "Rump-fed", "Shard-borne", "Sheep-biting", "Spur-galled", "Swag-bellied", "Tardy-gaited", "Tickle-brained", "Toad-spotted", "Unchin-snouted", "Weather-bitten"}, {"Apple-john", "Baggage", "Barnacle", "Bladder", "Boar-pig", "Bugbear", "Bum-bailey", "Canker-blossom", "Clack-dish", "Clot-pole", "Coxcomb", "Codpiece", "Death-token", "Dewberry", "Flap-dragon", "Flax-wench", "Flirt-gill", "Foot-licker", "Fustilarian", "Giglet", "Gudgeon", "Haggard", "Harpy", "Hedge-pig", "Horn-beast", "Huggermugger", "Jolt-head", "Lewdster", "Lout", "Maggot-pie", "Malt-worm", "Mammet", "Measle", "Minnow","Miscreant", "Mold-warp", "Mumble-news", "Nut-hook", "Pigeon-egg", "Pignut", "Puttock","Pumpion", "Rats-bane", "Scut", "Skains-mate", "Strumpet", "Varlot", "Vassal", "Whey-face", "Wagtail"}};
		String vowels = "AEIOU";
		String article = "an";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
			article = "a";
		}
		return String.format("Thou art %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}

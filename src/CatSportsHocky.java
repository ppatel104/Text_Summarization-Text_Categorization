/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saransh;


public class CatSportsHocky {
    
    
    int score;
    String[] sp_hocky = { "Accuracy", "Adulation", "Aggressive",
				"Agitator", "All-stars", "Arena", "Assists", "Athlete",
				"Autographs", "Banter", "Barrage", "Batter", "Berserk",
				"Blindside", "Blitz", "Block", "Blue", "line", "Boarding",
				"Brutality", "Canada", "Canadian", "Capture", "Careen",
				"Career", "Caution", "Cautious", "Center", "Championship",
				"Check", "Cheering", "Coach", "Command", "Competition",
				"Conciliatory", "Confrontation", "Consecutive", "Control",
				"Courageous", "Culpability", "Danger", "Dangerous", "Daunting",
				"Defense", "Defenseman", "Disastrous", "Discipline",
				"Dispatch", "Dispute", "Disruption", "Dominate",
				"Electrifying", "Eligibility", "Enforce", "Equipment",
				"Evaluate", "Execution", "Exercise", "Exertion", "Explode",
				"Face off", "Fans", "Fast", "Fighting", "Fitness", "Flail",
				"Flying", "Forceful", "Forward", "Fracture", "Freezing",
				"Frenzy", "Frozen", "Game", "Gauntlet", "Gear", "Gifted",
				"Glory", "Goal", "Goaltender", "Grievous", "Guard",
				"Hard", "check", "Hat", "trick", "Healthy", "Helmet",
				"High", "sticking", "History", "Hockey", "Hockey", "Hall", "of", "Fame",
				"Holler", "Honor", "Hoot", "Hostility", "Idol", "Ignite",
				"Impact", "Improvise", "Impulsive", "Incontrovertible",
				"Industrious", "Inflame", "Influence", "Injuries", "Instincts",
				"International", "Ire", "Jeer", "Jostle", "Jubilant",
				"Jubilation", "Juniors", "Keen", "Lament", "Launch",
				"Loathsome", "Lockers", "Losing", "Loss", "Maim", "Manager",
				"Mask", "Mayhem", "Menacing", "Missile", "Mission", "Muscular",
				"National", "Net", "Neutral", "Noisy", "Offensive", "Official",
				"Opening", "Origin", "Outburst", "Outdoors", "Ovation",
				"Overtime", "Pace", "Padding", "Paralysis", "Passer",
				"Passion", "Pastime", "Penalties", "Period", "Physical",
				"Play", "maker", "Players", "Playoffs", "Points", "Position",
				"Post", "season", "Power play", "Practice", "Premeditated",
				"Prize", "Proficient", "Protection", "Provocation", "Puck",
				"Quality", "Quarrel", "Quell", "Quest", "Quick", "Racket",
				"Rally", "Record-setting", "Recruitment", "Retaliation",
				"Retire", "Revered", "Rift", "Rink", "Rink", "side", "Rough",
				"Ruthlessness", "Salvage", "Savage", "Scars", "Score",
				"Scoring", "Screaming", "Season", "Security", "Setback",
				"Shin pads", "Shiver", "Shoot", "Shootout", "Shot", "Skates",
				"Skirmish", "Slashing", "Slump", "Sport", "Stanley", "Cup",
				"Star", "Statistics", "Status", "Strategy", "Streak",
				"Surgery", "Talent", "Tangled", "Tape", "Team", "Teammates",
				"Teamwork", "Threatening", "Thwart", "Tie", "Trainer",
				"Trophy", "Ultimate", "Unconventional", "Uniforms",
				"Unpredictable", "Urgency", "Velocity", "Victory", "Violence",
				"Vociferous", "Volatile", "Vow", "Vulnerable", "Warrant",
				"Whistle", "Win", "Wing", "Winter", "Workout", "Worldwide",
				"Worship", "Wounds", "X-rays", "Yells", "Youth", "Zamboni",
				"Zeal", "Zealous", "Zest", "Zigzag", "Zone" };

    
     
    
    int getHockyScore(String word){
    
        for (String sp_hocky1 : sp_hocky) {
    
//            System.out.print(comp1 +" "+word);
            if(sp_hocky1.equalsIgnoreCase(word)){
                score= 1;
                break;
            }else{
                
                score= 0;
            }
        }
        return score;
    }
    
}

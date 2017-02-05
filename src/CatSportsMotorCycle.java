/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saransh;


public class CatSportsMotorCycle {
    
    
    int score;
    String[] sp_motorcycle = {  "Ability", "Accuracy", "Activated",
				"Activity", "Advantage", "Aggressive", "All-star",
				"American League", "Announcer", "Appeal", "Appearance",
				"Appreciation", "Area", "Asset", "Athlete", "Attentive",
				"Attitude", "Audition", "Averages", "Awards", "Away game",
				"Awesome", "Balance", "Balk", "Ball park", "Ball player",
				"Banish", "Base", "Baseball", "Baseman", "Batter", "Batter up",
				"Beaten", "Behavior", "Bleachers", "Blindside", "Bonding",
				"Brick", "Broadcast", "Brutal", "Bunt", "Call", "Career",
				"Catch", "Catcher", "Caution", "Celebration", "Center",
				"Champion", "Championship", "Character", "Charisma", "Cheer",
				"Cities", "Classic", "Clubhouse", "Coach", "Collegiate",
				"Commemorate", "Commitment", "Common-sense", "Communication",
				"Competition", "Conditioning", "Conference", "Confidence",
				"Confrontation", "Consistent", "Contest", "Control",
				"Controversial", "Cooperation", "Cooperstown", "Correct",
				"Courageous", "Crowds", "Crush", "Dangerous", "Daunting",
				"Dead ball", "Defeat", "Defense", "Dependable", "Desire",
				"Determination", "Diligent", "Direction", "Disabled list",
				"Disastrous", "Discipline", "Dispute", "Division", "Dominate",
				"Double", "Double header", "Draft", "Dugout", "Dynamic",
				"Effective", "Electrifying", "Eligible", "Encouragement",
				"Endurance", "Energetic", "Enthusiasm", "Equipment", "ERA",
				"Esteem", "Ethics", "Euphoria", "Execute", "Exemplary",
				"Exhibition games", "Experience", "Extra innings", "Failure",
				"Fair", "Fair ball", "Fair territory", "Fan-fest", "Fans",
				"Farm team", "Fastball", "Field", "Fly ball", "Force",
				"Force play", "Forceful", "Forfeit", "Fortitude", "Foul",
				"Foul ball", "Foul territory", "Foul tip", "Fracture",
				"Frenzy", "Fumble", "Game", "Games", "Gear", "Glove", "Goal",
				"Grandstand", "Grievous", "Ground ball", "Ground out",
				"Guidance", "Hall of Fame", "Hard work", "Hits", "Hollering",
				"Home run", "Homer", "Hostility", "Illegal", "Impact",
				"Impartial", "Improvement", "In flight", "Inbound",
				"Industrious", "Ineligible", "Infield fly", "Infielder",
				"Injuries", "Inning", "Inspirational", "Instructions",
				"Instructive", "Intense", "Inter-league", "Intercollegiate",
				"Interference", "Ire", "Jargon", "Jeer", "Jerk", "Joy",
				"Jubilation", "Judge", "Keen", "Kinship", "Knock down",
				"Knuckle ball", "Laughter", "Lead", "Leadership", "League",
				"League", "Left-hander", "Legitimate", "Line drive", "Lines",
				"Live ball", "Local", "Lockers", "Lopsided", "Lose", "Loss",
				"Loyalty", "Major League", "Manager", "Maximize", "Mayhem",
				"Measurement", "Mechanics", "Medication", "Menace",
				"Metabolic", "Minor leagues", "Mitt", "Motivate", "Mound",
				"Muscles", "National League", "Negotiate", "Negro League",
				"Nemesis", "Nimble", "Noisy", "Notoriety", "Observant",
				"Obsession", "Obstruction", "Offense", "Offensive", "Official",
				"Opponent", "Opportunity", "Optimism", "Organization",
				"Outfielder", "Outstanding", "Ovation", "Overslide",
				"Overthrown", "Owner", "Participation", "Passion", "Pastime",
				"Penalty", "Percentage", "Perfect", "Performance",
				"Perseverance", "Persistence", "Perspective", "Pitcher",
				"Pivot foot", "Planes", "Planning", "Plate", "Player",
				"Players", "Playoffs", "Popular", "Position", "Possession",
				"Post season", "Practice", "Praise", "Preparation", "Pressure",
				"Prevention", "Professional", "Prohibited", "Promptness",
				"Protection", "Punctual", "Quality", "Quantity", "Quick",
				"Quirk", "Rally", "Rally-hat", "Ranking", "Ratings",
				"Reasonable", "Recognition", "Recognition", "Recruit",
				"Region", "Rehabilitation", "Rehabilitation", "Reliable",
				"Relief", "Resilient", "Retaliation", "Retire the side",
				"Reward", "Rotation", "Rough", "Run down", "Runner",
				"Ruthless", "Safe", "Schedule", "Scoreboard", "Scoreless",
				"Scoring", "Scouting", "Scrimmage", "Season", "Series",
				"Shift", "Shortstop", "Sidelines", "Signal", "Single", "Skill",
				"Skill", "Skirmish", "Spectacle", "Speed", "Split-second",
				"Sponsors", "Sport", "Sportsmanship", "Sprint", "Squad",
				"Stadium", "Stamina", "Standards", "Stands", "Starts",
				"Statistics", "Steal", "Strategy", "Strategy", "Streak",
				"Streak", "Strength", "Stress", "Strike", "Strike out",
				"Superstition", "Sweep", "Swerve", "Swing", "System", "Tag up",
				"Talent", "Team", "Teammate", "Teamwork", "Tenacious",
				"Third base", "Threat", "Throw", "Thwart", "Tickets", "Tie",
				"Tie game", "Tolerant", "Tour", "Trainer", "Training",
				"Travel", "Triple", "Triple play", "Trophy", "Trot",
				"Trustworthy", "Umpire", "Uniforms", "United", "Unusual",
				"Upcoming", "Update", "Urgency", "Valuable", "Variation",
				"Variety", "Velocity", "Victory", "Vigilant", "Vulnerable",
				"Walk", "Warm up", "Wild pitch", "Win", "Winded", "Winning",
				"Workout", "World Series", "Worthy", "X-rays", "Yard", "Yells",
				"Zeal", "Zealous", "Zigzag", "Zone" };

    
     
    
    int getMotorCycleScore(String word){
    
        for (String sp_motorcycle1 : sp_motorcycle) {
    
//            System.out.print(comp1 +" "+word);
            if(sp_motorcycle1.equalsIgnoreCase(word)){
                score= 1;
                break;
            }else{
                
                score= 0;
            }
        }
        return score;
    }
    
}

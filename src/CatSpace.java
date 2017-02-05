/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saransh;

public class CatSpace {
    
    
    int score;
    String[] space = { "Aberration", "Absolute", "Acceleration",
				"Achievement", "Administration", "Adventure", "Aerodynamics",
				"Aerogel", "Aerospace", "Agency", "Air Force", "Alien",
				"Altitude", "Ambient", "Ammonia", "Analysis", "Anomaly",
				"Apex", "Aphelion", "Apogee", "Apotheosis", "Arc", "Ascendant",
				"Asteroid", "Astronaut", "Astronomer", "Astronomy",
				"Atmosphere", "Aurora borealis", "Axis", "Azimuth", "Beyond",
				"Big Bang theory", "Binary", "Black hole", "Blazing", "Bodies",
				"Buffet", "Burn", "Burst", "Byproduct", "Carbon dioxide",
				"Celestial", "Centrifugal force", "Ceremony", "Challenger",
				"Chaos", "Circular", "Cislunar", "Climate", "Clouds", "Cold",
				"Collision", "Colossal", "Combustion", "Comet", "Commander",
				"Communication", "Composition", "Conjunction", "Consequence",
				"Constellation", "Contribution", "Corona", "Cosmic",
				"Cosmology", "Cosmonaut", "Crater", "Crew", "Crowd", "Cusp",
				"Danger", "Data", "Declination", "Degree", "Density", "Deploy",
				"Descendant", "Descent", "Disaster", "Discovery",
				"Disintegrate", "Display", "Distant", "Documentation",
				"Domination", "Double star", "Drift", "Dust", "Dwarf planet",
				"Eclipse", "Ecliptic", "Edmond", "Einstein", "Electron",
				"Ellipse", "Emission", "Encircle", "Engineer", "Eon",
				"Equator", "Equinox", "Equipment", "Evidence", "Evolution",
				"Exobiology", "Expansion", "Expedition", "Experiment",
				"Exploration", "Explosion", "Exposure", "External",
				"Extraterrestrial", "Fireball", "Flight",
				"Fluorocarbon content", "Force field", "Formation",
				"Fossil fuel", "Fragment", "Full moon", "Galactic", "Galaxy",
				"Galileo", "Gamma rays", "Gaseous", "Geocentric", "Geophysics",
				"Global", "Glory", "Gravitation", "Gravity", "Gyroscope",
				"Halley", "Halo", "Hazard", "Head-quarters", "Heat",
				"Heavenly body", "Hemisphere",
				"Herschel (Alexander and Caroline)", "Historic", "Honor",
				"Horizon", "Horizon", "Horoscope", "Hubble", "Hydraulic",
				"Hypothesis", "Icy", "Ignite", "Ignition", "Illumination",
				"Image", "Immediate", "Impact", "Impulse", "Industry",
				"Inquiry", "Inspection", "Instruments", "Intergalactic",
				"Interplanetary", "Interstellar", "Investigation",
				"Ionosphere", "Ions", "Jettison", "Journey", "Jupiter",
				"Justification", "Kilometers", "Kuiper Belt", "Laboratory",
				"Land form", "Launch", "Launch pad", "Legacy", "Liftoff",
				"Light years", "Location", "Luminosity", "Lunar", "Magnetic",
				"Magnitude", "Maneuver", "Map", "Mars", "Marvel",
				"Measurements", "Meteor", "Meteorite", "Methane", "Milky Way",
				"Mission", "Module", "Molecules", "Moon", "Moons", "Nadir",
				"NASA", "Navigation", "Nebula", "Newton", "Node", "North Star",
				"Northern Lights", "Nova", "Nutation", "Objective", "Objects",
				"Observable", "Operation", "Orbit", "Origin", "Outer space",
				"Overlap", "Ozone", "Parallax", "Particles", "Path",
				"Penetrate", "Penumbra", "Perigee", "Phase", "Pioneer",
				"Planet", "Planetarium", "Planetary", "Polestar", "Positions",
				"Praise", "Probe", "Productive", "Program", "Propellant",
				"Propulsion", "Protection", "Proton", "Prototype", "Public",
				"Pulsar", "Quarter moon", "Quasar", "Quest", "Questions",
				"Quintessence", "Radiation", "Rays", "Re-entry", "Reflector",
				"Reject", "Relativity", "Reliability", "Rendezvous",
				"Research", "Responsibility", "Restriction", "Revolution",
				"Revolve", "Rings", "Rocket", "Rocks", "Rotation", "Satellite",
				"Scientific", "Scientist", "Seismometer", "Sensation",
				"Session", "Sextant", "Shooting star", "Shuttle",
				"Significant", "Simulation", "Sir Issac", "Size", "Sky",
				"Soar", "Solar system", "Solstice", "Space", "Space craft",
				"Space station", "Spatial", "Spectrometry", "Spectrum",
				"Spherical", "Spinning", "Star dust", "Stars", "Stellar",
				"Storms", "Stratosphere", "Subatomic", "Success", "Sun",
				"Sunspot", "Super nova", "Support", "Sustain", "Swirling",
				"Syzygy", "Technology", "Telescope", "Temperature", "Terra",
				"Thrust", "Tide", "Track", "Tragedy", "Training", "Trajectory",
				"Transmissions", "Transport", "Turbulence", "Twinkle",
				"Ultraviolet rays", "Umbra", "Unique", "Universe", "Unknown",
				"Unstable", "Uranus", "Vaporize", "Variation", "Variety",
				"Vast", "Vehicle", "Velocity", "Vent", "Venus", "Vibration",
				"Vicinity", "View", "Violence", "Virtual", "Visible", "Vision",
				"Volcanic", "Voluntary", "Voyage", "Waning moon", "Warming",
				"Wavelength", "Waxing moon", "Weather", "Weightlessness",
				"Whirl", "Zeal", "Zenith", "Zero", "Zodiac", "Zone" };
    
     
    
    int getSpaceScore(String word){
    
        for (String space1 : space) {
    
//            System.out.print(comp1 +" "+word);
            if(space1.equalsIgnoreCase(word)){
                score= 1;
                break;
            }else{
                
                score= 0;
            }
        }
        return score;
    }
    
}

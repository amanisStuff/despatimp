package fsadpat
class mathmatician {
    fun doResearch() {
        println("mathmatician is doing reasearch")
    }
    fun developTheory() {
        println("mathmatician is developing theory")
    } 
   fun testTheory() {
        println("mathmatician is testing theory")} 
   fun solveProblem() {
        println("mathmatician is solving problem")
    }
    fun publishPaper() {
        println("mathmatician is publishing paper")
    }
}
class engineer {
    fun design() {
        println("engineer is designing")
    }
    fun build() {
        println("engineer is building")
    }
    fun test() {
        println("engineer is testing")
    }
    fun deploy() {
        println("engineer is deploying")
    }
}
class scientist {
    fun observe() {
        println("scientist is observing")
    }
    fun hypothesize() {
        println("scientist is hypothesizing")
    }
    fun experiment() {
        println("scientist is experimenting")
    }
    fun analyze() {
        println("scientist is analyzing")
    }
    fun conclude() {
        println("scientist is concluding")
    }
}

class LabFacade {
    private val mathmatician = mathmatician()
    private val engineer = engineer()
    private val scientist = scientist()
    
    fun conductFullResearchCycle() {
        println("--- Conducting Full Research Cycle ---")
        scientist.observe()
        scientist.hypothesize()
        mathmatician.doResearch()
        mathmatician.developTheory()
        scientist.experiment()
        scientist.analyze()
        mathmatician.testTheory()
        scientist.conclude()
        mathmatician.solveProblem()
        mathmatician.publishPaper()
        println("--- Full Research Cycle Completed ---")
    }

    fun conductEngineeringProject() {
        println("--- Conducting Engineering Project ---")
        engineer.design()
        engineer.build()
        engineer.test()
        engineer.deploy()
        println("--- Engineering Project Completed ---")
    }

    fun conductScientificStudy() {
        println("--- Conducting Scientific Study ---")
        scientist.observe()
        scientist.hypothesize()
        scientist.experiment()
        scientist.analyze()
        scientist.conclude()
        println("--- Scientific Study Completed ---")
    }
}
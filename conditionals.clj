;; predicates
;; are functions that verify a condition and returns a boolean
;; example
(defn tax-free? 
  [salary]
  (< salary 4000))

(def yuri-salary 800)
(def x 15)

(println (tax-free? yuri-salary))

;; IF example
(if (tax-free? yuri-salary) ;; functions as parameters
  (println "ISENTO!") ;; TRUE
  (println "NAO ISENTO")) ;; FALSE

;; cond example
(cond 
  (< x 15) (println "negativo")
  (> x 15) (println "POSITIVO")
  :else (println "CACETADA!"))

(condp = x ;; como um switch 
  < 15 "negativo"
  > 15 "positivo"
  "IGUALLLLLLLLLLLLLLLLL")

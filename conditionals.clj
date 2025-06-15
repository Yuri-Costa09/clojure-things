;; predicates
;; are functions that verify a condition and returns a boolean

;; example
(defn tax-free? 
  [salary]
  (< salary 4000))

(def yuri-salary 3999)

(println (tax-free? yuri-salary))

;; IF example
(if (<= yuri-salary 4000)
  (println "ISENTO!") ;; TRUE
  (println "NAO ISENTO")) ;; FALSE

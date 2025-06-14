(defn say-hello-world
  []
  (println "hello world"))

(defn say-hello-name
  [name]
  (println "Hello" name))

(def name-var "Yuri")

(say-hello-world)
(say-hello-name name-var)

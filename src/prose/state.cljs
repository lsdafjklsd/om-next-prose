(ns prose.state)

(def state {:shit "fuck"
            :line-in-progress {:id -1 :text "white snow"}
            :prose/stanzas [{:id 1
                             :title "slap chopp"
                             :prose/lines [{:id 1 :text "burger king"}
                                           {:id 2 :text "sven diagram"}
                                           {:id 3 :text "the laughing zebra"}]}
                            {:id 2
                             :title "elephants"
                             :prose/lines [{:id 1 :text "burger king"}
                                           {:id 2 :text "sven diagram"}
                                           {:id 4 :text "baskets"}]}]})
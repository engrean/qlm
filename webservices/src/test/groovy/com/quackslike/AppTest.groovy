package com.quackslike

import spock.lang.Specification


class AppTest extends Specification {

  App app = new App()

  def 'setAppName works'() {
    when:
    app.appName = 'joe'

    then:
    app.appName == 'joe'
  }

}
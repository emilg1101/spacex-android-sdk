workflow "Build and Test" {
  on = "push"
  resolves = "Build"
}

action "Build" {
  uses = "vgaidarji/android-github-actions/build@v1.0.0"
  args = "./gradlew assembleDebug -PpreDexEnable=false"
}

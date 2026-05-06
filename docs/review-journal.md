# Review Journal

The review surface for `kotlinsync` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its automation focus without claiming live deployment or external usage.

## Cases

- `baseline`: `dry-run spread`, score 187, lane `ship`
- `stress`: `rename risk`, score 186, lane `ship`
- `edge`: `operator cost`, score 167, lane `ship`
- `recovery`: `idempotence`, score 234, lane `ship`
- `stale`: `dry-run spread`, score 219, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
